package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Collection;

@Data
@Entity
@Table(name = "reservation")
public class Reservations {

    @Id
    private long id;
    private int NombreNuits;
    private Collection <Chambres> NombreChambre;
    private String date;
    private String DatePrevueArrivee;
    private String DatePrevueDepart;
    private float prix;
    private long idClient;
    private long idChambre;
}
