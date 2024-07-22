package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private int Duration;
    private Date BookingDate;
    private Date InitialArrivalDate;
    private Date InitialDepartureDate;
    private Date ArrivalDate;
    private Date DepartureDate;
    private float Price;
    private Customer Booker;

    /*@OneToMany(mappedBy = "Id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bedroom> Rooms;*/

    /*@OneToMany(mappedBy = "Id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Customer> customers;*/

    @ManyToOne
    @JoinColumn(name = "hotel_id") // foreign key column
    private Hotel hotel;


   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booker_id", referencedColumnName = "Id")
    private Customer booker;*/


}
