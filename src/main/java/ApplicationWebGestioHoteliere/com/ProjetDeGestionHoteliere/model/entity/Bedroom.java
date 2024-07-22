package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;


import ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.enumeration.Category;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bedroom")
public class Bedroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private int number;
    private float price;
    private Category category;

    @ManyToOne
    @JoinColumn(name = "hotel_id") // foreign key column
    private Hotel hotel;

}
