package com.jd2.TRDacademy.services.impl;

import com.jd2.TRDacademy.dao.ClientDao;
import com.jd2.TRDacademy.entities.Client;
import com.jd2.TRDacademy.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl extends BaseService<Client> implements ClientService {

    @Autowired
    ClientDao clientDao;

    @Override
    public List<String> getClientsEmail() {
        return clientDao.getClientsEmail();
    }
}