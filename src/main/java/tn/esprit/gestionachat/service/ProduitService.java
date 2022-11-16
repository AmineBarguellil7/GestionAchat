package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.Produit;


@Service
public class ProduitService extends IGenericServiceImpl<Produit,Long> implements IProduitService{
}
