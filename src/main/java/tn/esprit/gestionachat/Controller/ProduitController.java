package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.Produit;
import tn.esprit.gestionachat.entity.Stock;
import tn.esprit.gestionachat.service.ProduitService;
import tn.esprit.gestionachat.service.StockService;

import java.util.List;


@RestController
@RequestMapping("/produit")
public class ProduitController  {

    @Autowired
    ProduitService produitService;

    @PostMapping("/addP/{idC}/{ids}")
    public Produit addP(@RequestBody Produit p,@PathVariable Long idC,@PathVariable Long ids) {
        return produitService.addProduit(p,idC,ids);
    }

    @GetMapping("")
    public List<Produit> readP() {
        return produitService.retrieveAllProduits();
    }

    @PutMapping ("/updateP/{idCategorieProduit}/{idStock}")
    public void updateP(@RequestBody Produit p,@PathVariable Long idCategorieProduit,@PathVariable Long idStock) {
        produitService.updateProduit(p,idCategorieProduit,idStock);
    }

    @GetMapping("/read_P/{idP}")
    public Produit read_P(@PathVariable Long idP) {
        return produitService.retrieveProduit(idP);
    }

    @PutMapping("/assignProduitToStock/{idP}/{idS}")
    public void assignPToS(@PathVariable Long idP,@PathVariable Long idS) {
        produitService.assignProduitToStock(idP,idS);
    }
}
