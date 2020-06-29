package it.lispa.entges.frta.api.controller;

import it.lispa.entges.frta.api.domain.Esito;
import it.lispa.entges.frta.api.service.EsitoService;
import it.lispa.springline.jackson.FilteredResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class EsitoController {

	public static final Logger logger = LoggerFactory.getLogger(EsitoController.class);

	@Autowired
	private EsitoService esitoService;

	// -------------------Retrieve Single Esito------------------------------------------
	@GetMapping(value = "/esito/{idFlussoEsito}")
	public FilteredResponse getEsitoById(@PathVariable("idFlussoEsito") Long idFlussoEsito) {
		return FilteredResponse.serializeAll(esitoService.findById(idFlussoEsito));
	}

	// -------------------Retrieve All Esiti---------------------------------------------
	@GetMapping(value = "/allEsito")
	public FilteredResponse listAllEsito() {
		Collection<Esito> esiti = esitoService.findAllEsito();
		return FilteredResponse.serializeAll(esiti);
	}

	// -------------------Create a Esito-------------------------------------------
	@PostMapping(value = "/esito")
	public FilteredResponse createEsito(@RequestBody Esito esito) {
		logger.info("Creating Esito : {}", esito);
		esitoService.saveEsito(esito);
		return FilteredResponse.serializeAll(esito);
	}

	// ------------------- Update a Esito ------------------------------------------------
	@PutMapping(value = "/esito/{id}")
	public FilteredResponse updateEsito(@PathVariable("id") long id, @RequestBody Esito esito) {
		logger.info("Updating Esito with id {}", id);

		Optional<Esito> currentEsito = esitoService.findById(id);

		if (!currentEsito.isPresent()) {
			logger.error("Unable to update. User with id {} not found.", id);
		} else {
			//Set nomeNomeFileRicevuto
			currentEsito.get().setNomeFileRicevuto(esito.getNomeFileRicevuto());
			esitoService.updateEsito(currentEsito.get());
		}
		return FilteredResponse.serializeAll(currentEsito);
	}

	// ------------------- Delete a Esito-----------------------------------------
	@DeleteMapping(value = "/esito/{id}")
	public FilteredResponse deleteEsito(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting Esito with id {}", id);

		Optional<Esito> esito = esitoService.findById(id);
		if (!esito.isPresent()) {
			logger.error("Unable to delete. Esito with id {} not found.", id);
		} else {
			esitoService.deleteEsitoById(id);
		}

		return FilteredResponse.serializeAll(esitoService.findAllEsito());
	}

}