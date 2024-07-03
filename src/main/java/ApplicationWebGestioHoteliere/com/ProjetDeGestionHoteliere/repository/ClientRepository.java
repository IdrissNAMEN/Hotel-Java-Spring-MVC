package ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.repository;

import ApplicationWebGestioHoteliere.com.ProjetDeGestionHoteliere.model.endity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
}
