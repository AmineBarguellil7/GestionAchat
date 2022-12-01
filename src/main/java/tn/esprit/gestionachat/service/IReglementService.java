package tn.esprit.gestionachat.service;


import tn.esprit.gestionachat.entity.Reglement;


import java.util.Date;
import java.util.Set;

public interface IReglementService  {
    public Set<Reglement> retrieveReglementByFacture(Long idFacture);

    public Reglement addReglement(Reglement r, Long idFacture);

    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);

    public float pourcentageRecouvrement(Date startDate, Date endDate);
}
