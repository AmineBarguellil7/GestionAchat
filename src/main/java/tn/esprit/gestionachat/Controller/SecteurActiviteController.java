package tn.esprit.gestionachat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionachat.entity.SecteurActivite;
import tn.esprit.gestionachat.service.SecteurActiviteService;


import java.util.List;


@RestController
@RequestMapping("/secteuractivite")
public class SecteurActiviteController {
    @Autowired
    SecteurActiviteService secteurActiviteService;

    @PostMapping("/addsec")
    public SecteurActivite createsec(@RequestBody SecteurActivite s) {
        return secteurActiviteService.addSecteurActivite(s);
    }

    @GetMapping("")
    public List<SecteurActivite> readSec() {
        return secteurActiviteService.retrieveAllSecteurActivites();
    }

    @PutMapping ("/updateSec")
    public void updateSec(@RequestBody SecteurActivite s) {
        secteurActiviteService.updateSecteurActivite(s);
    }

    @GetMapping("/read_sec/{ids}")
    public SecteurActivite read_sec(@PathVariable Long ids) {
        return secteurActiviteService.retrieveSecteurActivite(ids);
    }


    @DeleteMapping("/deleteSec/{ids}")
    public void deleteSec(@PathVariable Long ids) {
        secteurActiviteService.removeSecteurActivite(ids);
    }
}
