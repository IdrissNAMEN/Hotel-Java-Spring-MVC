package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "facture")
public class Factures {

    @Id
    private long id;
    private float prixReservation;
    private float prixCommande;
    private float montant;
    private long idHotel;
    private long idClient;
    private long idReservation;
    private long idCommande;

}
