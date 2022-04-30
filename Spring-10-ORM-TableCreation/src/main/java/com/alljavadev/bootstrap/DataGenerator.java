package com.alljavadev.bootstrap;

import com.alljavadev.model.Car;
import com.alljavadev.repository.CarRepository;
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
