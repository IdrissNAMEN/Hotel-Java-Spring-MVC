package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prestations")
public class Commandes {

    @Id
    private long id;
    private String type;
    private float montant;
    private String articles;
    private long idClient;
    private long idChambres;
    private long idHotel;
}
