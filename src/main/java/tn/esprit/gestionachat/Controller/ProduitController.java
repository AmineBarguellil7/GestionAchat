package tn.esprit.gestionachat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionachat.Generic.GenericController;
import tn.esprit.gestionachat.entities.Produit;

@RestController
@RequestMapping("/produit")
public class ProduitController extends GenericController<Produit,Long> {

}
