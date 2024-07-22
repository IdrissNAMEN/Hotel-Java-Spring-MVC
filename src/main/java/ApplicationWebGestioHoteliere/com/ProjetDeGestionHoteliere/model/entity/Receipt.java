package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "receipt")
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private float BookingPrice;
    private float requestPrice;
    private float amount;
    private long IdHotel;
    private long IdCustomer;
    private long IdBooking;
    private long IdRequest;
    private String arrivalDate;
    private String departureDate;
    private String PaymentMethod;

}
