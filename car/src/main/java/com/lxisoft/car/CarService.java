package com.lxisoft.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService
{
private  final Car car;

@Autowired
public CarService(Car a)
{
    this.car = a;
}

public Car getCar() {
    return car;
}
     
}