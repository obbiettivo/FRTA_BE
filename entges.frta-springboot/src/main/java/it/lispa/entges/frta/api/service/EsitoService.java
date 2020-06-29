package it.lispa.entges.frta.api.service;

import it.lispa.entges.frta.api.domain.Car;
import it.lispa.entges.frta.api.domain.Esito;
import it.lispa.entges.frta.api.repository.EsitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EsitoService {

	@Autowired
	private EsitoRepository esitoRepository;

    public Optional<Esito> findById(Long idFlussoEsito) {
        return esitoRepository.findById(idFlussoEsito);
    }
}