package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "chambres")
public class Chambres {

    @Id
    private int numero;
    private float PrixParNuit;
    private boolean occupied;
    private long occupiedBy;
    private long idHotel;
}
