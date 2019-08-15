package com.jd2.TRDacademy.dao;


import com.jd2.TRDacademy.dao.impl.UserDaoImpl;
import com.jd2.TRDacademy.entities.User;
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
public class UserDaoTest {

    @Autowired
    UserDaoImpl userDao;

    @Test
    public void getUsernames() {
        List<String> usernames = userDao.getUsernames();
        for (String username : usernames) {
            System.out.println(username);
        }
        List<String> actual = userDao
                .getEm()
                .createQuery("SELECT u.username FROM User u")
                .getResultList();
        Assert.assertEquals(usernames, actual);
    }

    @Test
    public void getEmails() {
        List<String> emails = userDao.getEmails();
        for (String email : emails) {
            System.out.println(email);
        }
        List<String> actual = userDao
                .getEm()
                .createQuery("SELECT u.user_email FROM User u")
                .getResultList();
        Assert.assertEquals(emails, actual);
    }

    @Test
    public void getUsersByRole() {
        List<User> users = userDao.getUsersByRole("admin");
        for (User user: users) {
            System.out.println(user.getUsername());
        }
    }


}
