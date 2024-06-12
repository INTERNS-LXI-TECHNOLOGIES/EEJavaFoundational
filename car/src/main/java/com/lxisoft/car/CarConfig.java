package com.lxisoft.car;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig
{
@Value("${application.name}")
String name;
@Value("${application.noOfDoor}")
String noOfDoor;
@Value("${application.noOfTyre}")
String noOfTyre;
@Value("${application.noOfSteering}")
String noOfSteering;

@Bean
public Car car()
{
Car car = new Car();
car.setName(name);
car.setDoorDetails(noOfDoor);
car.setTyreDetails(noOfTyre);
car.setSteeringDetails(noOfSteering);
return car;

}


}