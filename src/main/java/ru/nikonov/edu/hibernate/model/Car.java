package ru.nikonov.edu.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Accessors(chain = true)
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String number;
}
