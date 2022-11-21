package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.Facture;


public interface FactureRepo extends JpaRepository<Facture,Long> {
}
