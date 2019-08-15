package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.entities.Car;


import java.util.List;

public interface CarService extends GenericService<Car> {

    List<Car> getCarsByClass(String classCar);
}
