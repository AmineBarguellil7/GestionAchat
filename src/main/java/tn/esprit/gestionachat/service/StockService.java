package tn.esprit.gestionachat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.StockRepo;
import tn.esprit.gestionachat.entity.Stock;

import java.util.List;



@Service
public class StockService  implements IStockService {
    @Autowired
    StockRepo stockRepo;


    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepo.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepo.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepo.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepo.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        if (stockRepo.findById(id).isPresent())
            stockRepo.deleteById(id);
    }

    Logger log= LoggerFactory.getLogger(StockService.class);
    @Scheduled(cron = "0 0 22 * * *")
    @Override
    public void retrieveStatusStock() {

        //without JPQL
        /*List<Stock> stocks=this.retrieveAllStocks();
        for (Stock stock:stocks) {
            if (stock.getQte()<stock.getQteMin()) {
                log.info("stock: "+stock);
            }
        }*/


        //with JPQL(In StockRepo)
        List<Stock> stocks=stockRepo.getAllConcernedStocks();
        for (Stock stock:stocks) {
            log.info("stock: "+stock);
        }
       }
}

