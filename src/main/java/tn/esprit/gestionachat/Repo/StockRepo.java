package tn.esprit.gestionachat.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.gestionachat.entity.Stock;

import java.util.List;


public interface StockRepo extends JpaRepository<Stock,Long> {

    //JPQL
    @Query("select s from Stock s where s.qte<s.qteMin")
    public List<Stock> getAllConcernedStocks();
}
