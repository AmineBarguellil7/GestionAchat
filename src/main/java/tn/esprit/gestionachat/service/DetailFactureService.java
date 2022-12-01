package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.DetailFactureRepo;
import tn.esprit.gestionachat.Repo.FactureRepo;
import tn.esprit.gestionachat.Repo.ProduitRepo;
import tn.esprit.gestionachat.entity.DetailFacture;
import tn.esprit.gestionachat.entity.Facture;
import tn.esprit.gestionachat.entity.Produit;

@Service
public class DetailFactureService  implements IDetailFactureService{
    @Autowired
    DetailFactureRepo detailFactureRepo;

    @Autowired
    FactureRepo factureRepo;

    @Autowired
    ProduitRepo produitRepo;

    @Override
    public DetailFacture addDetailFacture(DetailFacture detailFacture,Long idFacture,Long idProduit) {
        Facture facture=factureRepo.findById(idFacture).orElse(null);
        Produit produit=produitRepo.findById(idProduit).orElse(null);
        if (facture!=null && produit!=null) {
            detailFacture.setFactureDetail(facture);
            detailFacture.setProduit(produit);
        }
        return detailFactureRepo.save(detailFacture);
    }
}
