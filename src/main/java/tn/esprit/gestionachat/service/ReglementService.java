package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.Reglement;



@Service
public class ReglementService extends IGenericServiceImpl<Reglement,Long> implements IReglementService{
}
