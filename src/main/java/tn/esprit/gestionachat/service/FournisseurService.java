package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.Fournisseur;


@Service
public class FournisseurService extends IGenericServiceImpl<Fournisseur,Long> implements IFournisseurService{
}
