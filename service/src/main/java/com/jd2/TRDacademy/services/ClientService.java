package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.entities.Client;

import java.util.List;

public interface ClientService extends GenericService<Client> {

    List<String> getClientsEmail();
}
