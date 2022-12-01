package tn.esprit.gestionachat.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.SecteurActiviteRepo;
import tn.esprit.gestionachat.entity.SecteurActivite;

import java.util.List;

@Service
public class SecteurActiviteService  implements ISecteurActiviteService {

    @Autowired
    SecteurActiviteRepo secteurActiviteRepo;

    @Override
    public List<SecteurActivite> retrieveAllSecteurActivites() {
        return secteurActiviteRepo.findAll();
    }

    @Override
    public SecteurActivite addSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepo.save(sa);
    }

    @Override
    public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepo.save(sa);
    }

    @Override
    public SecteurActivite retrieveSecteurActivite(Long id) {
        return secteurActiviteRepo.findById(id).orElse(null);
    }

    @Override
    public void removeSecteurActivite(Long id) {
        if (secteurActiviteRepo.findById(id).isPresent())
            secteurActiviteRepo.deleteById(id);
    }
}
