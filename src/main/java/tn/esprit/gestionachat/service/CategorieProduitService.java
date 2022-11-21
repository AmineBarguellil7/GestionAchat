package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.CategorieProduitRepo;
import tn.esprit.gestionachat.entity.CategorieProduit;


import java.util.List;

@Service
public class CategorieProduitService  implements ICategorieProduitService{

    @Autowired
    CategorieProduitRepo categorieProduitRepo;


    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduitRepo.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepo.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepo.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduitRepo.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        if (categorieProduitRepo.findById(id).isPresent())
            categorieProduitRepo.deleteById(id);
    }
    }

