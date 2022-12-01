package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.Fournisseur;
import tn.esprit.gestionachat.service.FournisseurService;

import java.util.List;


@RestController
@RequestMapping("/fournisseur")
public class FournisseurController  {
    @Autowired
    FournisseurService fournisseurService;

    @PostMapping("/addF")
    public Fournisseur addF(@RequestBody Fournisseur f) {
        return fournisseurService.addFournisseur(f);
    }

    @GetMapping("")
    public List<Fournisseur> readF() {
        return fournisseurService.retrieveAllFournisseurs();
    }

    @PutMapping ("/updateF")
    public void updateF(@RequestBody Fournisseur f) {
        fournisseurService.updateFournisseur(f);
    }

    @GetMapping("/read_F")
    public Fournisseur read_F(@PathVariable Long idF) {
        return fournisseurService.retrieveFournisseur(idF);
    }

    @PutMapping ("/assignSec/{fournisseurId}/{secteurActiviteId}")
    public void assignSec(@PathVariable Long fournisseurId,@PathVariable Long secteurActiviteId) {
        fournisseurService.assignSecteurActiviteToFournisseur(fournisseurId,secteurActiviteId);
    }
}
