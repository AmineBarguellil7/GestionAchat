package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericService;
import tn.esprit.gestionachat.entities.Produit;


@Service
public interface IProduitService extends IGenericService<Produit,Long> {
}
