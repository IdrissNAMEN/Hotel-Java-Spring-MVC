package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "archive")
public class Archive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private long IdDate;
    private long IdCustomer;
    private long IdBedroom;
    private long IdRequest;
    private long IdBooking;
    private long IdReceipt;
    private long IdHotel;
}
