package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "historique")
public class Historique {

    @Id
    private long idDate;
    private long idClient;
    private long idChambre;
    private long idCommande;
    private long idReservation;
    private long idFacture;
    private long idHotel;
}
