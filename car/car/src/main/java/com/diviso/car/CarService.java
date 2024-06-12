package com.diviso.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final Car car;

    @Autowired
    public CarService(Car car) {
        this.car = car;
    }

    public Car getCarDetails() {
        return car;
    }
}
