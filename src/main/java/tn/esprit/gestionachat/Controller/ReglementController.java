package tn.esprit.gestionachat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionachat.Generic.GenericController;
import tn.esprit.gestionachat.entities.CategorieProduit;
import tn.esprit.gestionachat.entities.Reglement;


@RestController
@RequestMapping("/reglement")
public class ReglementController extends GenericController<Reglement,Long> {
}
