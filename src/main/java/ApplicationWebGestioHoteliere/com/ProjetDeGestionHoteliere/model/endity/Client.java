package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="client")
public class Client {
    @Id
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String date_arrivee;
    private String date_sortie;
    private String mode_paiement;
    private long idHotel;
}
