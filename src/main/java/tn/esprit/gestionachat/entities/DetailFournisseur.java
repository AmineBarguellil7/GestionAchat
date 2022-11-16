package tn.esprit.gestionachat.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur;
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;
    @OneToOne(mappedBy = "fournisseurDetail")
    Fournisseur fournisseur;
}
