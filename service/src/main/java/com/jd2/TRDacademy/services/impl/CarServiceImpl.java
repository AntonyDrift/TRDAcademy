package com.jd2.TRDacademy.services.impl;

import com.jd2.TRDacademy.dao.CarDao;
import com.jd2.TRDacademy.entities.Car;
import com.jd2.TRDacademy.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl extends BaseService<Car> implements CarService {

    @Autowired
    CarDao carDao;

    @Override
    public List<Car> getCarsByClass(String classCar) {
        return carDao.getCarsByClass(classCar);
    }
}