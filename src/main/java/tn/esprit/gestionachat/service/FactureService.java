package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.DetailFactureRepo;
import tn.esprit.gestionachat.Repo.FactureRepo;
import tn.esprit.gestionachat.Repo.FournisseurRepo;
import tn.esprit.gestionachat.entity.Facture;
import tn.esprit.gestionachat.entity.Fournisseur;



import java.util.List;
import java.util.Set;

@Service
public class FactureService implements IFactureService{
    @Autowired
    FactureRepo factureRepo;

    @Autowired
    FournisseurRepo fournisseurRepo;

    @Autowired
    DetailFactureRepo detailFactureRepo;

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepo.findAll();
    }

    @Override
    public Facture cancelFacture(Long id) {
        Facture facture=factureRepo.findById(id).orElse(null);
        facture.setArchivee(true);
        return factureRepo.save(facture);
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepo.findById(id).orElse(null);
    }



    @Override
    public Facture addFacture(Facture f, Long idFournisseur) {
        Fournisseur fournisseur=fournisseurRepo.findById(idFournisseur).orElse(null);
        if (fournisseur!=null) {
            f.setFournisseur(fournisseur);
            return factureRepo.save(f);
        }
        return null;
    }

    @Override
    public Set<Facture> getFacturesByFournisseur(Long idFournisseur) {
        Fournisseur fournisseur=fournisseurRepo.findById(idFournisseur).orElse(null);
        return fournisseur.getListFactures();
    }
}
