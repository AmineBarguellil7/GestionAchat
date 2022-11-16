package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.Facture;

@Service
public class FactureService extends IGenericServiceImpl<Facture,Long> implements IFactureService{
}
