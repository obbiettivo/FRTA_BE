package it.lispa.entges.frta.api.controller;

import io.swagger.annotations.ApiOperation;
import it.lispa.entges.frta.api.domain.Car;
import it.lispa.entges.frta.api.service.CarService;
import it.lispa.entges.frta.api.service.EsitoService;
import it.lispa.springline.jackson.FilteredResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

}