package com.jd2.TRDacademy.dao.impl;

import com.jd2.TRDacademy.dao.RequestDao;
import com.jd2.TRDacademy.entities.Request;
import org.springframework.stereotype.Repository;

@Repository
public class RequestDaoImpl extends BaseDao<Request> implements RequestDao {

    public RequestDaoImpl() {
        super();
        clazz = Request.class;
    }
}
