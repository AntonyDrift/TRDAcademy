package com.jd2.TRDacademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
@Component
public class Car implements Serializable {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "car_id")
    private Long carId;
    @Column(name = "model")
    private String model;
    @Column(name = "wheel_drive")
    private String wheelDrive;
    @Column(name = "power")
    private Integer power;
    @Column(name = "available")
    private Integer available;
    @Column(name = "class_car")
    private String classCar;

}
