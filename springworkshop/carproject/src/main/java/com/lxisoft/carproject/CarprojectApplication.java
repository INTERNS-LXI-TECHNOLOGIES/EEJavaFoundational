package com.lxisoft.carproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class CarprojectApplication  implements CommandLineRunner {
@Autowired
	public Car car;
	public static void main(String[] args) {
		SpringApplication.run(CarprojectApplication.class, args);
	}

	public  void run(String[] args)throws Exception
	{
			car.printDoor();
			car.printTyre();
	}

}
