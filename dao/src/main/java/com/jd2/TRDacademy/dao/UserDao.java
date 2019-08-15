package com.jd2.TRDacademy.dao;

import com.jd2.TRDacademy.entities.User;

import java.util.List;

public interface UserDao extends GenericDao<User> {

    List<String> getUsernames();
    List<String> getEmails();
    List<User> getUsersByRole(String role);
}
