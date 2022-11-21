package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.Operateur;

public interface OperateurRepo extends JpaRepository<Operateur,Long> {
}
