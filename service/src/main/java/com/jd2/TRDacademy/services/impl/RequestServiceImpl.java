package com.jd2.TRDacademy.services.impl;

import com.jd2.TRDacademy.dao.RequestDao;
import com.jd2.TRDacademy.entities.Request;
import com.jd2.TRDacademy.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RequestServiceImpl extends BaseService<Request> implements RequestService {

    @Autowired
    RequestDao requestDao;

}