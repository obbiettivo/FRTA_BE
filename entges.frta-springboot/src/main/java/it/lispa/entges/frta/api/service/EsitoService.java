package it.lispa.entges.frta.api.service;

import it.lispa.entges.frta.api.domain.Esito;
import it.lispa.entges.frta.api.repository.EsitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class EsitoService {

	@Autowired
	private EsitoRepository esitoRepository;

    public Optional<Esito> findById(Long idFlussoEsito) {
        return esitoRepository.findById(idFlussoEsito);
    }

    public Collection<Esito> findAllEsito() {
        return esitoRepository.findAll();
    }

    public Esito saveEsito(Esito esito) {
        return esitoRepository.save(esito);
    }

    public void updateEsito(Esito esito) {
        saveEsito(esito);
    }

    public void deleteEsitoById(long id) {
        esitoRepository.deleteById(id);
    }
}