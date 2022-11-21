package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.gestionachat.Repo.OperateurRepo;



public class OperateurService  implements IOperateurService{
    @Autowired
    OperateurRepo operateurRepo;
}
