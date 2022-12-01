package tn.esprit.gestionachat.service;


import tn.esprit.gestionachat.entity.Facture;

import java.util.List;
import java.util.Set;

public interface IFactureService  {
    List<Facture> retrieveAllFactures();
    Facture cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    Facture addFacture(Facture f, Long idFournisseur);

    Set<Facture> getFacturesByFournisseur(Long idFournisseur);
}
