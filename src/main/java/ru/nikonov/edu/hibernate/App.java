package ru.nikonov.edu.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.nikonov.edu.hibernate.model.Car;
import ru.nikonov.edu.hibernate.repository.CarRepository;

@SpringBootApplication
public class App {

    @Autowired
    CarRepository carRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public ApplicationRunner dataLoader() {
        return args -> {
            createData();
            System.out.println();
        };
    }

    public void createData() {
        carRepository.save(new Car().setNumber("001"));

    }
}