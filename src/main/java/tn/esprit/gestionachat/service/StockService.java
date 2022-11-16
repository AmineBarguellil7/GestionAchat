package tn.esprit.gestionachat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Repo.StockRepo;
import tn.esprit.gestionachat.entities.Stock;

import java.util.List;


@Service
public class StockService implements IStockService {

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
        {
            stockRepo.deleteById(id);
        }
    }
}
