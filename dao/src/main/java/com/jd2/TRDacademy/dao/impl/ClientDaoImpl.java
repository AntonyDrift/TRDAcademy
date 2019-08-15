package com.jd2.TRDacademy.dao.impl;

import com.jd2.TRDacademy.dao.ClientDao;
import com.jd2.TRDacademy.entities.Client;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl extends BaseDao<Client> implements ClientDao {

    private static Logger logger = Logger.getLogger(ClientDaoImpl.class);

    public  ClientDaoImpl() {
        super();
        clazz = Client.class;
    }

    @Override
    public List<String> getClientsEmail() {
        List<String> clientEmails = getEm()
                .createQuery("SELECT c.email FROM Client c").getResultList();
        logger.info("Get " + clientEmails);
        return clientEmails;
    }
}



