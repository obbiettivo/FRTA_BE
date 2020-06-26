package it.lispa.entges.frta.api.controller;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import it.lispa.springline.jackson.FilteredResponse;

import it.lispa.entges.frta.api.domain.Car;
import it.lispa.entges.frta.api.service.CarService;

@RestController
public class CarController {

	public static final Logger logger = LoggerFactory.getLogger(CarController.class);

	@Autowired
	private CarService carService;

	@GetMapping({ "/{name}.json" })
	@Transactional(readOnly = true)
	@ApiOperation(value = "Restituisce la macchina con il nome", response = Iterable.class)
	public FilteredResponse findByCarName(@PathVariable("name") String name) {
		Collection<Car> cars = this.carService.findByCarName(name);
		return FilteredResponse.serializeAll(cars);
	}

	@GetMapping("/coolCars")
	@Transactional(readOnly = true)
	@ApiOperation(value = "Restituisce la liste delle macchine cool", response = Iterable.class)
	public FilteredResponse coolCars() {
		Collection<Car> cars = carService.coolCars();
		return FilteredResponse.serializeAll(cars);
	}

	// -------------------Retrieve All Cars---------------------------------------------
	@GetMapping(value = "/allCars")
	public FilteredResponse listAllCars() {
		Collection<Car> cars = carService.findAllCars();
		return FilteredResponse.serializeAll(cars);
	}

	// -------------------Retrieve Single Car------------------------------------------
	@GetMapping(value = "/cars/{id}")
	public FilteredResponse getCar(@PathVariable("id") long id) {
		logger.info("Fetching Car with id {}", id);
		Optional<Car> car = carService.findById(id);
		return FilteredResponse.serializeAll(car);
	}

	// -------------------Create a Car-------------------------------------------
	@PostMapping(value = "/cars")
	public FilteredResponse createCar(@RequestBody Car car) {
		logger.info("Creating Car : {}", car);
		
		if (carService.isCarExist(car.getName())) {
			logger.error("Unable to create. A Car with name {} already exist", car.getName());
		} else {
			carService.saveCar(car);
		}
		return FilteredResponse.serializeAll(car);
	}
	
	// ------------------- Update a Car ------------------------------------------------
	@PutMapping(value = "/cars/{id}")
	public FilteredResponse updateCar(@PathVariable("id") long id, @RequestBody Car car) {
		logger.info("Updating Car with id {}", id);

		Optional<Car> currentCar = carService.findById(id);

		if (!currentCar.isPresent()) {
			logger.error("Unable to update. User with id {} not found.", id);
		} else {
			currentCar.get().setName(car.getName());
			carService.updateCar(currentCar.get());
		}
		return FilteredResponse.serializeAll(currentCar);
	}
	
	// ------------------- Delete a Car-----------------------------------------
	@DeleteMapping(value = "/cars/{id}")
	public FilteredResponse deleteCar(@PathVariable("id") long id) {
		logger.info("Fetching & Deleting Car with id {}", id);

		Optional<Car> car = carService.findById(id);
		if (!car.isPresent()) {
			logger.error("Unable to delete. Car with id {} not found.", id);
		} else {
			carService.deleteCarById(id);
		}
		return coolCars();
	}
}