package tn.esprit.gestionachat.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionachat.entity.Stock;


public interface StockRepo extends JpaRepository<Stock,Long> {
}
