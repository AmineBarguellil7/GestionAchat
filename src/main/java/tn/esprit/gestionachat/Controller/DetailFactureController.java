package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.DetailFacture;
import tn.esprit.gestionachat.entity.Facture;
import tn.esprit.gestionachat.service.DetailFactureService;


@RestController
@RequestMapping("/detailfacture")
public class DetailFactureController {
    @Autowired
    DetailFactureService detailFactureService;

    @PostMapping("/addDetailFac/{idFacture}/{idProduit}")
    public DetailFacture addDetailFac(@RequestBody DetailFacture detailFacture,@PathVariable Long idFacture,@PathVariable Long idProduit) {
        return detailFactureService.addDetailFacture(detailFacture,idFacture,idProduit);
    }
}
