package it.lispa.entges.frta.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.lispa.entges.frta.api.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
	@Query("select c from Car c where upper(c.name) = upper(?1)")
	List<Car> findByCarName(String name);
}
