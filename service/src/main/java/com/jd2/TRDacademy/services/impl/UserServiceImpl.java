package com.jd2.TRDacademy.services.impl;

import com.jd2.TRDacademy.dao.UserDao;
import com.jd2.TRDacademy.entities.User;
import com.jd2.TRDacademy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<String> getUsernames() {
        return userDao.getUsernames();
    }

    @Override
    public List<String> getEmails() {
        return userDao.getEmails();
    }

    @Override
    public List<User> getUsersByRole(String role) {
        return userDao.getUsersByRole(role);
    }
}