package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.Reglement;


public interface ReglementRepo extends JpaRepository<Reglement,Long> {
}
