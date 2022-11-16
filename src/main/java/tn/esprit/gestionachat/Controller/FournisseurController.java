package tn.esprit.gestionachat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionachat.Generic.GenericController;
import tn.esprit.gestionachat.entities.Fournisseur;


@RestController
@RequestMapping("/fournisseur")
public class FournisseurController extends GenericController<Fournisseur,Long> {
}
