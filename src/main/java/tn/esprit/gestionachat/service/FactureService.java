package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.FactureRepo;
import tn.esprit.gestionachat.entity.Facture;

import java.util.List;

@Service
public class FactureService implements IFactureService{
    @Autowired
    FactureRepo factureRepo;

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
    public Facture addFacture(Facture facture) {
        return factureRepo.save(facture);
    }
}
