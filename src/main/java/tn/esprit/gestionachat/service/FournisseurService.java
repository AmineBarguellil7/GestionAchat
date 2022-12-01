package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.DetailFournisseurRepo;
import tn.esprit.gestionachat.Repo.FournisseurRepo;
import tn.esprit.gestionachat.Repo.SecteurActiviteRepo;
import tn.esprit.gestionachat.entity.DetailFournisseur;
import tn.esprit.gestionachat.entity.Fournisseur;
import tn.esprit.gestionachat.entity.SecteurActivite;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class FournisseurService  implements IFournisseurService{

    @Autowired
    FournisseurRepo fournisseurRepo;

    @Autowired
    DetailFournisseurRepo detailFournisseurRepo;

    @Autowired
    SecteurActiviteRepo secteurActiviteRepo;

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

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fournisseur=fournisseurRepo.findById(fournisseurId).orElse(null);
        SecteurActivite secteurActivite=secteurActiviteRepo.findById(secteurActiviteId).orElse(null);
        if (secteurActivite!=null && fournisseur!=null) {
            if (fournisseur.getListSecteur()!=null) {
                fournisseur.getListSecteur().add(secteurActivite);
            }
            else {
                Set<SecteurActivite> listSecteur=new HashSet<>();
                listSecteur.add(secteurActivite);
                fournisseur.setListSecteur(listSecteur);
            }
        }
        fournisseurRepo.save(fournisseur);
    }
}
