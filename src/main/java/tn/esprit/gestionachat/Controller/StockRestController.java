package tn.esprit.gestionachat.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entities.Stock;
import tn.esprit.gestionachat.service.IStockService;

import java.util.List;


@RestController
@RequestMapping("/stock")
public class StockRestController {
    @Autowired
    IStockService stockService;

    @PostMapping("/addstock")
    public Stock create(@RequestBody Stock stock) {
        return stockService.addStock(stock);
    }

    @GetMapping("")
    public List<Stock> read() {
        return stockService.retrieveAllStocks();
    }

    @PutMapping("/updatestock")
    public Stock update(@RequestBody Stock stock) {
        return stockService.updateStock(stock);
    }

    @GetMapping("/read_S/{idS}")
    public Stock read_T(@PathVariable Long idS) {
        return stockService.retrieveStock(idS);
    }


    @DeleteMapping("/delete/{idS}")
    public void delete(@PathVariable Long idS) {
        stockService.removeStock(idS);
    }
}
