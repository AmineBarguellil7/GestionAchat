package tn.esprit.gestionachat.service;

import tn.esprit.gestionachat.entity.Stock;

import java.util.List;

public interface IStockService  {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
}
