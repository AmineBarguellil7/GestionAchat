package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.gestionachat.Repo.ReglementRepo;




public class ReglementService  implements IReglementService{

    @Autowired
    ReglementRepo reglementRepo;
}
