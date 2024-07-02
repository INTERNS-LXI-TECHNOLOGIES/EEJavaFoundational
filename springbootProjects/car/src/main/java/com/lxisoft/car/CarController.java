package com.lxisoft.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private CarService car;

    @Autowired
    public CarController(CarService cc) {
        this.car = cc;

    }

    @GetMapping("/car")
    public Car getCarController() {
        return car.getCar();

    }

}