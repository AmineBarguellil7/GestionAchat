package tn.esprit.gestionachat.service;


import tn.esprit.gestionachat.entity.DetailFacture;

public interface IDetailFactureService {
    DetailFacture addDetailFacture(DetailFacture detailFacture,Long idFacture,Long idProduit);
}
