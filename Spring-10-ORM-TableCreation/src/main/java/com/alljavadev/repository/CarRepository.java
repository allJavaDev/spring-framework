package com.alljavadev.repository;

import com.alljavadev.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
//Repository works with Entities not DTO
//we don't need @Repository, Spring updated
public interface CarRepository extends JpaRepository<Car, Long> {
}
