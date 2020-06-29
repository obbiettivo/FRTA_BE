package it.lispa.entges.frta.api.repository;

import it.lispa.entges.frta.api.domain.Esito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * Repositiry per table TGA7AT_FRTA_FLUSSO_ESITO
 * ***/
@Repository
public interface EsitoRepository extends JpaRepository<Esito, Long> {
	/*@Query("select c from Car c where upper(c.name) = upper(?1)")
	List<Car> findByCarName(String name);

	@Query("select e from Esito e where upper(e.idFlussoEsito) = upper(?1)")
	Esito findById(Integer idFlussoEsito);*/
}
