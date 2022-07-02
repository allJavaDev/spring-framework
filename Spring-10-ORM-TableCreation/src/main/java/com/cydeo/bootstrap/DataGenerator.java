package com.cydeo.bootstrap;

import com.cydeo.model.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1= new Car("Honda","CRV");
        Car c2= new Car("Tesla","X123");
        carRepository.save(c1);
        carRepository.save(c2);
    }
}
