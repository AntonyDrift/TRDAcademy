package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.dao.impl.UserDaoImpl;
import com.jd2.TRDacademy.entities.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.plaf.PanelUI;
import java.util.List;

@ContextConfiguration(value = "/service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class UserServiceTest {

    @Autowired
    UserService userService;
    @Autowired
    UserDaoImpl userDao;


    public void getUsernames() {
        List<String> expected = userService.getUsernames();
        List<String> actual = userDao
                .getEm()
                .createQuery("SELECT u.username FROM User u")
                .getResultList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmails() {
        List<String> expected = userService.getEmails();
        List<String> actual = userDao
                .getEm()
                .createQuery("SELECT u.useEmail FROM User u")
                .getResultList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUsersByRole() {
        String role = "admin";
        List<User> expected = userService.getUsersByRole(role);
        List<User> actual = userDao
                .getEm()
                .createQuery("FROM User u WHERE u.role=:role")
                .setParameter("role", role)
                .getResultList();
       Assert.assertEquals(expected, actual);
    }
}
