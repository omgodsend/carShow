package com.binary.carShow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@SpringBootApplication

public class CarShowApplication {

private static final Logger logger = LoggerFactory.getLogger(CarShowApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(CarShowApplication.class, args);
		logger.info("Application started");



	}

}
