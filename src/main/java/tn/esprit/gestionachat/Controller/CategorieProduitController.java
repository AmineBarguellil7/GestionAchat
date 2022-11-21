package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.CategorieProduit;
import tn.esprit.gestionachat.service.CategorieProduitService;

import java.util.List;


@RestController
@RequestMapping("/categorieproduit")
public class CategorieProduitController  {

    @Autowired
    CategorieProduitService categorieProduitService;
    @PostMapping("/addC")
    public CategorieProduit createC(@RequestBody CategorieProduit  categorieProduit) {
        return categorieProduitService.addCategorieProduit(categorieProduit);
    }

    @GetMapping("")
    public List<CategorieProduit> readC() {
        return categorieProduitService.retrieveAllCategorieProduits();
    }

    @PutMapping ("/updateC")
    public void updateC(@RequestBody CategorieProduit categorieProduit) {
        categorieProduitService.updateCategorieProduit(categorieProduit);
    }

    @GetMapping("/read_C/{idC}")
    public CategorieProduit read_C(@PathVariable Long idC) {
        return categorieProduitService.retrieveCategorieProduit(idC);
    }


    @DeleteMapping("/deleteC/{idC}")
    public void deleteC(@PathVariable Long idC) {categorieProduitService.removeCategorieProduit(idC);
    }
}
