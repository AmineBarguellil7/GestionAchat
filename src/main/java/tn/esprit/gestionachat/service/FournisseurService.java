package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.DetailFournisseurRepo;
import tn.esprit.gestionachat.Repo.FournisseurRepo;
import tn.esprit.gestionachat.entity.DetailFournisseur;
import tn.esprit.gestionachat.entity.Fournisseur;

import java.util.List;

@Service
public class FournisseurService  implements IFournisseurService{

    @Autowired
    FournisseurRepo fournisseurRepo;

    @Autowired
    DetailFournisseurRepo detailFournisseurRepo;

    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepo.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        DetailFournisseur detailFournisseur=new DetailFournisseur();
        detailFournisseurRepo.save(detailFournisseur);
        f.setFournisseurDetail(detailFournisseur);
        return fournisseurRepo.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepo.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepo.findById(id).orElse(null);
    }
}
