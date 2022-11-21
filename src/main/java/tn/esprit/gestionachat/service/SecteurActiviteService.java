package tn.esprit.gestionachat.service;


import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.gestionachat.Repo.SecteurActiviteRepo;



public class SecteurActiviteService  implements ISecteurActiviteService {

    @Autowired
    SecteurActiviteRepo secteurActiviteRepo;
}
