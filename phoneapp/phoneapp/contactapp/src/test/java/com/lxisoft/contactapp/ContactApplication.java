package com.lxisoft.contactapp;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class ContactApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ContactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // You can add any startup logic here if needed
    }
}
