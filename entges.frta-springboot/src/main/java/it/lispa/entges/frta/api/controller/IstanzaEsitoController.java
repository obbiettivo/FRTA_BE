package it.lispa.entges.frta.api.controller;

import it.lispa.entges.frta.api.domain.IstanzaEsito;
import it.lispa.entges.frta.api.service.IstanzaEsitoService;
import it.lispa.springline.jackson.FilteredResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class IstanzaEsitoController {

	public static final Logger logger = LoggerFactory.getLogger(IstanzaEsitoController.class);

	@Autowired
	private IstanzaEsitoService istanzaEsitoService;

	// -------------------Retrieve Single istanzaEsito------------------------------------------
	@GetMapping(value = "/istanzaEsito/{idFlusso}")
	public FilteredResponse getIstanzaEsitoById(@PathVariable("idFlusso") Long idFlusso) {
		return FilteredResponse.serializeAll(istanzaEsitoService.findIstanzaEsito(idFlusso));
	}

	// -------------------Retrieve All istanzaEsito---------------------------------------------
	@GetMapping(value = "/allIstanzaEsito")
	public FilteredResponse listAllIstanzaEsito() {
		Collection<IstanzaEsito> istanzaEsiti = istanzaEsitoService.findAllIstanzaEsito();
		return FilteredResponse.serializeAll(istanzaEsiti);
	}

	// -------------------Create a istanzaEsito-------------------------------------------
	@PostMapping(value = "/istanzaEsito")
	public FilteredResponse createIstanzaEsito(@RequestBody IstanzaEsito istanzaEsito) {
		logger.info("Creating istanzaEsito : {}", istanzaEsito);
		istanzaEsitoService.saveIstanzaEsito(istanzaEsito);
		return FilteredResponse.serializeAll(istanzaEsito);
	}

	// ------------------- Update a istanzaEsito ------------------------------------------------
	@PutMapping(value = "/istanzaEsito/{id}")
	public FilteredResponse updateIstanzaEsito(@PathVariable("id") long id, @RequestBody IstanzaEsito istanzaEsito) {
		logger.info("Updating Esito with id {}", id);

		Optional<IstanzaEsito> currentIstanzaEsito = istanzaEsitoService.findIstanzaEsito(id);

		if (!currentIstanzaEsito.isPresent()) {
			logger.error("Unable to update. User with id {} not found.", id);
		} else {
			//Set errore a caso
			currentIstanzaEsito.get().setCdErrore(istanzaEsito.getCdErrore());
			istanzaEsitoService.updateIstanzaEsito(currentIstanzaEsito.get());
		}
		return FilteredResponse.serializeAll(currentIstanzaEsito);
	}

	// ------------------- Delete a istanzaEsito-----------------------------------------
	@DeleteMapping(value = "/istanzaEsito/{id}")
	public FilteredResponse deleteIstanzaEsito(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting istanzaEsito with id {}", id);

		Optional<IstanzaEsito> istanzaEsito = istanzaEsitoService.findIstanzaEsito(id);
		if (!istanzaEsito.isPresent()) {
			logger.error("Unable to delete. Esito with id {} not found.", id);
		} else {
			istanzaEsitoService.deleteIstanzaEsitoById(id);
		}

		return FilteredResponse.serializeAll(istanzaEsitoService.findAllIstanzaEsito());
	}

}