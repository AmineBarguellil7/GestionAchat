package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entities.Facture;

public interface FactureRepo extends JpaRepository<Facture,Long> {
}
