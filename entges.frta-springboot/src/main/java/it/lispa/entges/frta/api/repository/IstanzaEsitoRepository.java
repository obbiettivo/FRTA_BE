package it.lispa.entges.frta.api.repository;

import it.lispa.entges.frta.api.domain.Car;
import it.lispa.entges.frta.api.domain.IstanzaEsito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IstanzaEsitoRepository extends JpaRepository<IstanzaEsito, Long> {
	/*@Query("select c from Car c where upper(c.name) = upper(?1)")
	List<Car> findByCarName(String name);*/
}
