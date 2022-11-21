package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.gestionachat.Repo.DetailFactureRepo;


public class DetailFactureService  implements IDetailFactureService{
    @Autowired
    DetailFactureRepo detailFactureRepo;
}
