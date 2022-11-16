package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entities.Fournisseur;

public interface FournisseurRepo extends JpaRepository<Fournisseur,Long> {
}
