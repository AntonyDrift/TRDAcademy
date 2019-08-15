package com.jd2.TRDacademy.services;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T> {

    T add(T t);

    T update(T t);

    void delete(Long id);

    T get(Serializable id);

    List<T> getAll();
}
