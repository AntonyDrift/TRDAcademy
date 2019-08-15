package com.jd2.TRDacademy.services.impl;

import com.jd2.TRDacademy.dao.GenericDao;
import com.jd2.TRDacademy.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class BaseService<T> implements GenericService<T> {

    @Autowired
    private GenericDao<T> baseDao;

    @Override
    public T add(T t) {
        return baseDao.add(t);
    }

    @Override
    public T update(T t) {
        return baseDao.update(t);
    }

    @Override
    public void delete(Long id) {
        baseDao.delete(id);
    }

    @Override
    public T get(Serializable id) {
        return baseDao.get(id);
    }

    @Override
    public List<T> getAll() {
        return baseDao.getAll();
    }
}
