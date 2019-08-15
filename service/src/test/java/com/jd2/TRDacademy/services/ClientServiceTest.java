package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.dao.ClientDao;
import com.jd2.TRDacademy.dao.impl.ClientDaoImpl;
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
public class ClientServiceTest {

    @Autowired
    ClientService clientService;
    @Autowired
    ClientDaoImpl clientDao;

    @Test
    public void getClientsEmail() {
        List<String> expected = clientService.getClientsEmail();
        List<String> actual = clientDao.getEm()
                .createQuery("SELECT c.email FROM Client c")
                .getResultList();
        Assert.assertEquals(expected, actual);
    }

}
