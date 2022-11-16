package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entities.DetailFacture;

public interface DetailFactureRepo extends JpaRepository<DetailFacture,Long> {
}
