package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entities.Operateur;

public interface OperateurRepo extends JpaRepository<Operateur,Integer> {
}
