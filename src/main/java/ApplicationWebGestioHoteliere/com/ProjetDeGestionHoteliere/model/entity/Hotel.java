package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Firstname;
    private String address;
    private String PhoneNumber;

    @OneToMany(mappedBy = "Id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Bedroom> room;

    /*@OneToMany(mappedBy = "Id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> userList;*/




}
