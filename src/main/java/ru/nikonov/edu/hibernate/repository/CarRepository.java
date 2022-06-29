package ru.nikonov.edu.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nikonov.edu.hibernate.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
