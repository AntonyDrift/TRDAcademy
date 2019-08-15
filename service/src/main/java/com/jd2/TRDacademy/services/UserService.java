package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.entities.User;

import java.util.List;

public interface UserService extends GenericService<User> {

        List<String> getUsernames();
        List<String> getEmails();
        List<User> getUsersByRole(String role);
    }
