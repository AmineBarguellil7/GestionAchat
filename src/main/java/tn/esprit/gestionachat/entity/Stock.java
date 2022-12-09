package tn.esprit.gestionachat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer qte;
    private Integer qteMin;
    private String libelleStock;
    @JsonIgnore
    @OneToMany(mappedBy = "stock",fetch = FetchType.EAGER)
    Set<Produit> listProduit;

    @Override
    public String toString() {
        return "Stock{" +
                "idStock=" + idStock +
                ", qte=" + qte +
                ", qteMin=" + qteMin +
                ", libelleStock='" + libelleStock + '\'' +
                ", listProduit=" + listProduit +
                '}';
    }
}
