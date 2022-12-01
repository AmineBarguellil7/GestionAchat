package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.FactureRepo;
import tn.esprit.gestionachat.Repo.ReglementRepo;
import tn.esprit.gestionachat.entity.Facture;
import tn.esprit.gestionachat.entity.Reglement;


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ReglementService  implements IReglementService {

    @Autowired
    ReglementRepo reglementRepo;

    @Autowired
    FactureRepo factureRepo;

    @Override
    public Set<Reglement> retrieveReglementByFacture(Long idFacture) {
        Facture facture = factureRepo.findById(idFacture).orElse(null);
        return facture.getReglements();
    }

    @Override
    public Reglement addReglement(Reglement r, Long idFacture) {
        Facture facture = factureRepo.findById(idFacture).orElse(null);
        Set<Reglement> reglements = new HashSet<>();
        reglements = this.retrieveReglementByFacture(idFacture);
        float sommeM = 0f;
        float reste = 0f;
        float montantF=facture.getMontantFacture();
        if (facture!=null) {
            for (Reglement reglement : reglements) {
                sommeM += reglement.getMontantRestant();
            }
            reste = montantF - sommeM;
            if (r.getMontantRestant()<=reste) {
                r.setFacture(facture);
            }
            return reglementRepo.save(r);
        }
        return null;
    }

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        List<Reglement> reglements=reglementRepo.findAll();
        float chiffreA= 0;
        for (Reglement reglement : reglements) {
            if (reglement.getDateReglement().after(startDate) && reglement.getDateReglement().before(endDate) && !reglement.getFacture().isArchivee()) {
                    chiffreA += reglement.getMontantRestant();

            }
        }
        return chiffreA;
    }

    @Override
    public float pourcentageRecouvrement(Date startDate, Date endDate) {
        List<Facture> factures = factureRepo.findAll();
        float TotalReg = 0f;
        float TotalF = 0f;
        float pourcentage = 0f;
        for (Facture facture : factures) {
            if (facture.getDateCreationFacture().after(startDate) && facture.getDateCreationFacture().before(endDate) && !facture.isArchivee()) {
                TotalF += facture.getMontantFacture();
                Set<Reglement> reglements= facture.getReglements();
                for (Reglement reglement : reglements) {
                    TotalReg += reglement.getMontantRestant();
                }
            }
        }
        pourcentage = (TotalReg / TotalF) * 100;
        return pourcentage;
    }
}
