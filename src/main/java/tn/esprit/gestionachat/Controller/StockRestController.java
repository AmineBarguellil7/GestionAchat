package tn.esprit.gestionachat.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.Stock;
import tn.esprit.gestionachat.service.StockService;


import java.util.List;


@RestController
@RequestMapping("/stock")
public class StockRestController  {

    @Autowired
    StockService stockService;

    @PostMapping("/addS")
    public Stock createS(@RequestBody Stock s) {
        return stockService.addStock(s);
    }

    @GetMapping("")
    public List<Stock> readS() {
        return stockService.retrieveAllStocks();
    }

    @PutMapping ("/updates")
    public void updateContra(@RequestBody Stock s) {
        stockService.updateStock(s);
    }

    @GetMapping("/read_s/{ids}")
    public Stock read_s(@PathVariable Long ids) {
        return stockService.retrieveStock(ids);
    }


    @DeleteMapping("/deletes/{ids}")
    public void deletes(@PathVariable Long ids) {
        stockService.removeStock(ids);
    }

    @GetMapping("/retrieve")
    public void retrieveStatusStock() {
        stockService.retrieveStatusStock();
    }
}
