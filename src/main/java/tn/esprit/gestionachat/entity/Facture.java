package tn.esprit.gestionachat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private boolean archivee;
    @OneToMany(mappedBy = "facture")
    Set<Reglement> reglements;
    @OneToMany(mappedBy ="factureDetail",cascade = CascadeType.ALL)
    Set<DetailFacture> detailFactures;
    @ManyToOne
    private Fournisseur fournisseur;
}
