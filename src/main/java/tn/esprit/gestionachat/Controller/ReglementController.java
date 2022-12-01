package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.Reglement;
import tn.esprit.gestionachat.service.ReglementService;


import java.util.Set;


@RestController
@RequestMapping("/reglement")
public class ReglementController  {
    @Autowired
    ReglementService reglementService;

    @GetMapping("/getReg/{idFacture}")
    public Set<Reglement> retrieveReglementByFacture(@PathVariable Long idFacture) {
        return reglementService.retrieveReglementByFacture(idFacture);
    }

    @PostMapping("/addR/{idFacture}")
    public Reglement addReglement(@RequestBody Reglement r,@PathVariable Long idFacture) {
        return reglementService.addReglement(r,idFacture);
    }
}
