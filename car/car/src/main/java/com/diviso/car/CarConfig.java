package com.diviso.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Value("${car.name}")
    private String carName;

    @Value("${car.numberOfDoors}")
    private int numberOfDoors;

    @Value("${car.numberOfTyres}")
    private int numberOfTyres;

    @Value("${car.hasSteering}")
    private boolean hasSteering;

    @Bean
    public Car car() {
        Car car = new Car();
        car.setName(carName);
        car.setNumberOfDoors(numberOfDoors);
        car.setNumberOfTyres(numberOfTyres);
        car.setHasSteering(hasSteering);
        return car;
    }
}
