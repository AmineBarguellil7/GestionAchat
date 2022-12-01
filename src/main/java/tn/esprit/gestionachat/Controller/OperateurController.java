package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.Operateur;
import tn.esprit.gestionachat.service.OperateurService;


import java.util.List;


@RestController
@RequestMapping("/operateur")
public class OperateurController  {
    @Autowired
    OperateurService operateurService;

    @PostMapping("/addO")
    public Operateur createO(@RequestBody Operateur o) {
        return operateurService.addOperateur(o);
    }

    @GetMapping("")
    public List<Operateur> readO() {
        return operateurService.retrieveAllOperateurs();
    }

    @PutMapping ("/updateO")
    public void updateO(@RequestBody Operateur o) {
        operateurService.updateOperateur(o);
    }

    @GetMapping("/read_O/{idO}")
    public Operateur read_s(@PathVariable Long idO) {
        return operateurService.retrieveOperateur(idO);
    }


    @DeleteMapping("/deleteO/{idO}")
    public void deleteO(@PathVariable Long idO) {
        operateurService.removeOperateur(idO);
    }

    @PutMapping("/assignOperateur/{idOperateur}/{idFacture}")
    public void assignOperateurToFacture(@PathVariable  Long idOperateur, @PathVariable Long idFacture) {
        operateurService.assignOperateurToFacture(idOperateur,idFacture);
    }
}
