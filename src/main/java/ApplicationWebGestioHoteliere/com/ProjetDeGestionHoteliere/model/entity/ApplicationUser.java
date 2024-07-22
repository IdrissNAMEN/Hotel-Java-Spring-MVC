package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String FirstName;
    private String LastName;
    private String JobPost; // énumération;
    private String Email;
    private String UserName;
    private String Password;

    @ManyToOne
    @JoinColumn(name = "Id")
    private Hotel hotel;
    private long IdManager;

}
