package tn.esprit.gestionachat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionachat.Generic.GenericController;
import tn.esprit.gestionachat.entities.CategorieProduit;

@RestController
@RequestMapping("/categorieproduit")
public class CategorieProduitController extends GenericController<CategorieProduit,Long> {
}
