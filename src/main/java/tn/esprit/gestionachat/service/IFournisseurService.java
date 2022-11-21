package tn.esprit.gestionachat.service;


import tn.esprit.gestionachat.entity.Fournisseur;

import java.util.List;

public interface IFournisseurService  {
    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);
}
