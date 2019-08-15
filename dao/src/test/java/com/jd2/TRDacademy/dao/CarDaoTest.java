package com.jd2.TRDacademy.dao;

import com.jd2.TRDacademy.dao.impl.CarDaoImpl;
import com.jd2.TRDacademy.entities.Car;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


@Transactional
@ContextConfiguration(value = "/test-dao.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CarDaoTest {

    @Autowired
    CarDaoImpl carDao;

    @Test
    public void getByClass() {
        List<String> expectedString = new ArrayList<>();
        List<Car> cars = carDao.getCarsByClass("rally");
        for (Car car : cars) {
            expectedString.add(car.getWheelDrive());
            System.out.println(car.getModel());
        }
        List<String> actual = carDao.getEm()
                .createQuery("SELECT c.wheelDrive FROM Car c WHERE c.classCar=:classCar")
                .setParameter("classCar", "RALLY")
                .getResultList();
        System.out.println(actual);
        assertEquals(expectedString, actual);
    }
}

