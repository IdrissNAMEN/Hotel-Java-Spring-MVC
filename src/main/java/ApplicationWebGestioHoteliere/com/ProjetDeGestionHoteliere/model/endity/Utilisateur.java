package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    private long id;
    private String name;
    private String prenom;
    private String Typeposte; // énumération;
    private String login;
    private String password;
    private long idHotel;
    private long idManager;

}
