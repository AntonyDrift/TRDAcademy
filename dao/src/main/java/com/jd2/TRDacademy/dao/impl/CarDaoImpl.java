package com.jd2.TRDacademy.dao.impl;

import com.jd2.TRDacademy.dao.CarDao;
import com.jd2.TRDacademy.entities.Car;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDaoImpl extends BaseDao<Car> implements CarDao {

    private static Logger logger = Logger.getLogger(CarDaoImpl.class);

    public  CarDaoImpl() {
        super();
        clazz = Car.class;
    }

    public List<Car> getCarsByClass(String classCar) {
        List<Car> cars = getEm()
                .createQuery("FROM Car c WHERE c.classCar=:classCar")
                .setParameter("classCar", classCar)
                .getResultList();
        logger.info("Get " +cars +  " by class=" + classCar);
        return cars;
    }
}



