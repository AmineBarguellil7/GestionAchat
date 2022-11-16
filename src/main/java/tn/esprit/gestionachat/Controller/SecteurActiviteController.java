package tn.esprit.gestionachat.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionachat.Generic.GenericController;
import tn.esprit.gestionachat.entities.SecteurActivite;

@RestController
@RequestMapping("/secteuractivite")
public class SecteurActiviteController extends GenericController<SecteurActivite,Long> {
}
