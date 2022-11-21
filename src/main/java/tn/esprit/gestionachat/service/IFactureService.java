package tn.esprit.gestionachat.service;


import tn.esprit.gestionachat.entity.Facture;

import java.util.List;

public interface IFactureService  {
    List<Facture> retrieveAllFactures();
    Facture cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    Facture addFacture(Facture facture);
}
