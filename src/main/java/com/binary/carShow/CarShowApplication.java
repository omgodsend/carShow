package com.binary.carShow;

import com.binary.carShow.entity.Car;
import com.binary.carShow.repository.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;

import java.util.Arrays;


@SpringBootApplication

public class CarShowApplication implements CommandLineRunner {
	@Autowired
	private CarRepository carRepository;
private static final Logger logger = LoggerFactory.getLogger(CarShowApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(CarShowApplication.class, args);
		logger.info("Application started");



	}

	@Override
	public void run(String... args) throws Exception {

		List<Car> cars = Arrays.asList(
				new Car("Ford", "Lightning","Gray","FL-2234", 2023,75000),
				new Car("Nissan", "Leaf","Green","BFG-345", 2022,4000),
				new Car("Toyota","Sienna","Silver","CDF-223",2024,6000),
				new Car("Honda","Accord","White","HW-321",2024,57000));
				carRepository.saveAll(cars);

				carRepository.
						findAll().forEach(car -> logger.info(car.getMake()+" " + car.getModel()));

	}

	// OBM (Object Relational Mapping) teqnique allows you to fetch from and manipulate a database by using OOP paradigm

}
