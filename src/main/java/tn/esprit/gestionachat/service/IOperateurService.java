package tn.esprit.gestionachat.service;


import tn.esprit.gestionachat.entity.Operateur;

import java.util.List;

public interface IOperateurService  {
    List<Operateur> retrieveAllOperateurs();

    Operateur addOperateur (Operateur o);

    Operateur updateOperateur (Operateur o);

    Operateur retrieveOperateur (Long id);

    void removeOperateur (Long id);
    public void assignOperateurToFacture(Long idOperateur, Long idFacture);
}
