package com.jd2.TRDacademy.dao;

import com.jd2.TRDacademy.entities.Car;

import java.util.List;

public interface CarDao extends GenericDao<Car> {

    List<Car> getCarsByClass(String classCar);
}
