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
public class BaseServiceTest {

    @Autowired
    CarService carService;
    @Autowired
    CarDaoImpl carDao;

    @Test
    public void add() {

        Car car = new Car(null, "SUBARU", "4WD", 280, 1, "RALLY");
        Car expected = carService.add(car);
        Car actual = carDao.getEm().find(Car.class,expected.getCarId());
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void get() {
        Car expected = carService.get(1L);
        Car actual = carDao.getEm().find(Car.class,expected.getCarId());
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAll() {
        List<Car> expected = carService.getAll();
        List<Car> actual = carDao.getEm()
                .createQuery("FROM Car")
                .getResultList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void update() {
        Car car = carService.get(4L);
        String namingModelBefore = car.getModel();
        car.setModel("SUZUKI");
        Car expected = carService.update(car);
        String namingModelAfter = expected.getModel();
        System.out.println("Before: " + namingModelBefore);
        System.out.println("After: " + namingModelAfter);
        Car actual = carDao.getEm().find(Car.class, expected.getCarId());
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void delete() {
        Car car = carDao.get(4L);
        System.out.println(car);
        carService.delete(4L);
        Car actual = carDao.getEm().find(Car.class, 4l);
        Assert.assertTrue(actual==null);
    }
}
