package it.lispa.entges.frta.api.service;

import it.lispa.entges.frta.api.domain.IstanzaEsito;
import it.lispa.entges.frta.api.repository.IstanzaEsitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class IstanzaEsitoService {

	@Autowired
	private IstanzaEsitoRepository istanzaEsitoRepository;

    public Optional<IstanzaEsito> findIstanzaEsito (Long idFlusso) {
        return istanzaEsitoRepository.findById(idFlusso);
    }

    public Collection<IstanzaEsito> findAllIstanzaEsito() {
        return istanzaEsitoRepository.findAll();
    }

    public IstanzaEsito saveIstanzaEsito(IstanzaEsito istanzaEsito) {
        return istanzaEsitoRepository.save(istanzaEsito);
    }

    public void updateIstanzaEsito(IstanzaEsito istanzaEsito) {
        saveIstanzaEsito(istanzaEsito);
    }

    public void deleteIstanzaEsitoById(long id) {
        istanzaEsitoRepository.deleteById(id);
    }
}