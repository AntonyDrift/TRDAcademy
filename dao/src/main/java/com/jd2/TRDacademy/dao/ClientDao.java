package com.jd2.TRDacademy.dao;

import com.jd2.TRDacademy.entities.Client;

import java.util.List;

public interface ClientDao extends GenericDao<Client> {

    List<String> getClientsEmail();
}
