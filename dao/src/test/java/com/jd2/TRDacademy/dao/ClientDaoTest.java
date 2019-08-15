package com.jd2.TRDacademy.dao;


import com.jd2.TRDacademy.dao.impl.ClientDaoImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@ContextConfiguration(value = "/test-dao.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ClientDaoTest {

    @Autowired
    ClientDaoImpl clientDao;

    @Test
    public void getClientsEmail() {
        List<String> clientsEmail = clientDao.getClientsEmail();
        List<String> actual = clientDao
                .getEm()
                .createQuery("SELECT c.email FROM Client c")
                .getResultList();
        Assert.assertEquals(clientsEmail, actual);

    }


}
