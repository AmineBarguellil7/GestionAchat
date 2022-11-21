package tn.esprit.gestionachat.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.Produit;


public interface ProduitRepo extends JpaRepository<Produit,Long> {
    //Produit save(Produit p,Long idCategorieProduit, Long idStock);
}
