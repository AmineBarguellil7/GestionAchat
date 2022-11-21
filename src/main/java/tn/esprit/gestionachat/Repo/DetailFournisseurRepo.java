package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.DetailFournisseur;


public interface DetailFournisseurRepo extends JpaRepository<DetailFournisseur,Long> {
}
