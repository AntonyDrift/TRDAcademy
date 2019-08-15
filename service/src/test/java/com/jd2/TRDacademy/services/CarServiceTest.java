package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.dao.impl.CarDaoImpl;
import com.jd2.TRDacademy.entities.Car;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@ContextConfiguration(value = "/service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class CarServiceTest {


    @Autowired
    CarService carService;
    @Autowired
    CarDaoImpl carDao;

    @Test
    public void getByClass() {
        List<Car> expected = carService.getCarsByClass("rally");
        List<Car> actual = carDao.getEm()
                .createQuery("FROM Car c WHERE c.classCar=:classCar")
                .setParameter("classCar", "rally")
                .getResultList();
        Assert.assertEquals(expected, actual);
    }
}
