package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.CategorieProduit;

@Service
public class CategorieProduitService extends IGenericServiceImpl<CategorieProduit,Long> implements ICategorieProduitService{
}
