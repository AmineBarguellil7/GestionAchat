package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.CategorieProduitRepo;
import tn.esprit.gestionachat.Repo.ProduitRepo;
import tn.esprit.gestionachat.Repo.StockRepo;
import tn.esprit.gestionachat.entity.CategorieProduit;
import tn.esprit.gestionachat.entity.Produit;
import tn.esprit.gestionachat.entity.Stock;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class ProduitService implements IProduitService{

    @Autowired
    ProduitRepo produitRepo;

    @Autowired
    CategorieProduitRepo categorieProduitRepo;

    @Autowired
    StockRepo stockRepo;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepo.findAll();
    }

    @Transactional
    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit categorieProduit=categorieProduitRepo.findById(idCategorieProduit).orElse(null);
        Stock stock=stockRepo.findById(idStock).orElse(null);
        produitRepo.save(p);
        if (stock!=null && categorieProduit!=null) {
            p.setCategorieProduit(categorieProduit);
            p.setStock(stock);
        }
        return p;
    }

    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit categorieProduit=categorieProduitRepo.findById(idCategorieProduit).orElse(null);
        Stock stock=stockRepo.findById(idStock).orElse(null);
        p.setCategorieProduit(categorieProduit);
        p.setStock(stock);
        return produitRepo.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepo.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock stock=stockRepo.findById(idStock).orElse(null);
        Produit produit=produitRepo.findById(idProduit).orElse(null);
        produit.setStock(stock);
        produitRepo.save(produit);
    }
}
