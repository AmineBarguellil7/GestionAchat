package tn.esprit.gestionachat.service;



import tn.esprit.gestionachat.entity.CategorieProduit;


import java.util.List;

public interface ICategorieProduitService  {
    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

    void removeCategorieProduit(Long id);
}
