package com.jd2.TRDacademy.dao;

import com.jd2.TRDacademy.dao.impl.CarDaoImpl;
import com.jd2.TRDacademy.dao.impl.UserDaoImpl;
import com.jd2.TRDacademy.entities.Car;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

import java.util.List;

@Transactional
@ContextConfiguration(value = "/test-dao.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseDaoTest {

    @Autowired
    CarDaoImpl carDao;
    @Autowired
    UserDaoImpl userDao;

    @Test
    public void add() {
        Car car = new Car(null, "SUBARU", "4WD", 280, 1, "RALLY");
        Car expected = carDao.add(car);
        assertEquals(expected, car);
    }

    @Test
    public void get() {
        Car expected = carDao.get(1L);
        assertEquals(expected.getCarId().longValue(),1L);

    }

    @Test
    public void getAll() {
        List<Car> cars = carDao.getAll();
        for (Car car : cars) {
            System.out.println(car.getModel());
        }
        List<Car> actual = carDao.getEm().createQuery("FROM Car ").getResultList();
        assertTrue("Test ok", cars.size() == actual.size());
    }

    @Test
    public void update() {

        Car car = carDao.getEm().find(Car.class, 2L);
        car.setModel("SUZUKI");
        Car expected = carDao.update(car);
        Car actual = carDao.getEm().find(Car.class, 2L);
        assertEquals(expected, actual);
    }

    @Test
    public void delete() {
        carDao.delete(2L);
        assertNull(carDao.getEm().find(Car.class, 2L));//true
//        assertNull(carDao.getEm().find(Car.class, 3L));//false
    }
}
