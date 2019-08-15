package com.jd2.TRDacademy.dao.impl;

import com.jd2.TRDacademy.dao.UserDao;
import com.jd2.TRDacademy.entities.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {

    private static Logger logger = Logger.getLogger(UserDaoImpl.class);

    public UserDaoImpl() {
        super();
        clazz = User.class;
    }

    @Override
    public List<String> getUsernames() {
        List<String> usernames = getEm()
                .createQuery("SELECT u.username FROM User u")
                .getResultList();
        logger.info("Get " + usernames);
        return usernames;
    }

    @Override
    public List<String> getEmails() {
        List<String> userEmails = getEm()
                .createQuery("SELECT u.user_email FROM User u")
                .getResultList();
        logger.info("Get " + userEmails);
        return userEmails;
    }

    @Override
    public List<User> getUsersByRole(String role) {
        List<User> users = getEm()
                .createQuery("FROM User u WHERE u.role=:role")
                .setParameter("role", role)
                .getResultList();
        logger.info("Get " + users + " where role " + role);
        return users;
    }
}

