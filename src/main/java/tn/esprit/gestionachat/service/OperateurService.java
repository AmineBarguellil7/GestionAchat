package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.Operateur;


@Service
public class OperateurService extends IGenericServiceImpl<Operateur,Long> implements IOperateurService{
}
