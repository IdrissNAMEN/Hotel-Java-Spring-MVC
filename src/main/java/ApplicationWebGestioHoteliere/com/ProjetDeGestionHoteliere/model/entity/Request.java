package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String type;
    private float amount;
    private String item;
    private long IdCustomer;
    private long IdBedroom;
    private long idHotel;
}
