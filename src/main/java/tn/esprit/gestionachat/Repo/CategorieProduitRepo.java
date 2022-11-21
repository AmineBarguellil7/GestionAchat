package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.CategorieProduit;

public interface CategorieProduitRepo extends JpaRepository<CategorieProduit,Long> {
}
