package it.lispa.entges.frta.api.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.lispa.entges.frta.api.domain.Car;
import it.lispa.entges.frta.api.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public List<Car> findByCarName(String name) {
		return carRepository.findByCarName(name);
	}

    public Collection<Car> coolCars() {
        return carRepository.findAll().stream().filter(this::isCool).collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") && !car.getName().equals("Triumph Stag") &&
                !car.getName().equals("Ford Pinto") && !car.getName().equals("Yugo GV");
    }

	public Collection<Car> findAllCars() {
		return carRepository.findAll();
	}

	public Optional<Car> findById(long id) {
		return carRepository.findById(id);
	}
	
	public boolean isCarExist(String name) {
		return !carRepository.findByCarName(name).isEmpty();
	}

	public Car saveCar(Car car) {
		return carRepository.save(car);
	}

	public void updateCar(Car car) {
		saveCar(car);
	}

	public void deleteCarById(long id) {
		carRepository.deleteById(id);
	}
}