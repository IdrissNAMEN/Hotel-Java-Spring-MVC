package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    private long id;
    private String name;
    private String adresse;
    private String telephone;
    private int NombreLuxe;
    private int NombreNormale;
    private Collection <Utilisateur> listeUtilisateurs;
    private Collection <Client> listelisteClient;


}
