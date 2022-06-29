package ru.nikonov.edu.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Accessors(chain = true)
public class Car {

    @Id
    @SequenceGenerator(name = "car_seq",
        sequenceName = "car_sequence",
        allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_seq")
    private Long id;
    private String number;
}
