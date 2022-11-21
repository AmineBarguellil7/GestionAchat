package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.gestionachat.Repo.DetailFournisseurRepo;
import tn.esprit.gestionachat.entity.DetailFournisseur;




public class DetailFournisseurService  implements IDetailFournisseurService{

    @Autowired
    DetailFournisseurRepo detailFournisseurRepo;

}
