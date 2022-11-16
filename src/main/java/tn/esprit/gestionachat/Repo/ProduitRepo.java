package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entities.Produit;

public interface ProduitRepo extends JpaRepository<Produit,Integer> {
}
