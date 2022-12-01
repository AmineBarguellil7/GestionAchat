package tn.esprit.gestionachat.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private Integer qteCommandee;
    private float pourcentageRemise;
    private float montantRemise;
    private float prixTotalDetail;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Facture factureDetail;
    @ManyToOne
    Produit produit;
}
