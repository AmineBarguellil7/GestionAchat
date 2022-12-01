package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.FactureRepo;
import tn.esprit.gestionachat.Repo.OperateurRepo;
import tn.esprit.gestionachat.entity.Facture;
import tn.esprit.gestionachat.entity.Operateur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class OperateurService  implements IOperateurService{
    @Autowired
    OperateurRepo operateurRepo;

    @Autowired
    FactureRepo factureRepo;

    @Override
    public List<Operateur> retrieveAllOperateurs() {
        return operateurRepo.findAll();
    }

    @Override
    public Operateur addOperateur(Operateur o) {
        return operateurRepo.save(o);
    }

    @Override
    public Operateur updateOperateur(Operateur o) {
        return operateurRepo.save(o);
    }

    @Override
    public Operateur retrieveOperateur(Long id) {
        return operateurRepo.findById(id).orElse(null);
    }

    @Override
    public void removeOperateur(Long id) {
        if (operateurRepo.findById(id).isPresent())
            operateurRepo.deleteById(id);
    }

    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur=operateurRepo.findById(idOperateur).orElse(null);
        Facture facture=factureRepo.findById(idFacture).orElse(null);
        if (facture!=null && operateur!=null) {
            if (operateur.getFactures()!=null) {
                operateur.getFactures().add(facture);
            }
            else {
                Set<Facture> listfactures=new HashSet<>();
                listfactures.add(facture);
                operateur.setFactures(listfactures);
            }
        }
        operateurRepo.save(operateur);
    }
}
