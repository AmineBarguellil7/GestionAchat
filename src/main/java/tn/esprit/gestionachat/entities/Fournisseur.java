package tn.esprit.gestionachat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    Set<Facture> listFactures;
    @OneToOne
    DetailFournisseur fournisseurDetail;
    @ManyToMany
    Set<SecteurActivite> listSecteur;
}
