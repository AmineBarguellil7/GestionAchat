package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.Facture;
import tn.esprit.gestionachat.service.FactureService;

import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/facture")
public class FactureController  {
    @Autowired
    FactureService factureService;

    @GetMapping("")
    public List<Facture> readFac() {
        return factureService.retrieveAllFactures();
    }

    @PostMapping("/addFac/{idFournisseur}")
    public Facture addFac(@RequestBody Facture facture,@PathVariable Long idFournisseur) {
        return factureService.addFacture(facture,idFournisseur);
    }

    @PutMapping ("/CancelFacture/{idFac}")
    public Facture CancelFacture(@PathVariable Long idFac) {
        return factureService.cancelFacture(idFac);
    }

    @GetMapping("/read_Fac/{idFac}")
    public Facture read_Fac(@PathVariable Long idFac) {
        return factureService.retrieveFacture(idFac);
    }

    @GetMapping("/get/{idFournisseur}")
    public Set<Facture> getFacturesByFournisseur(@PathVariable Long idFournisseur) {
        return factureService.getFacturesByFournisseur(idFournisseur);
    }
}
