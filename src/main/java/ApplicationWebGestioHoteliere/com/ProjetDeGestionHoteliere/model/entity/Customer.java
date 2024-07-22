package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;


    //@ManyToOne
    //@JoinColumn(name = "Id")
    //private Hotel hotel;

    /*@ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;*/


    /*@OneToOne(mappedBy = "booker")
    private Booking bookings;*/


}
