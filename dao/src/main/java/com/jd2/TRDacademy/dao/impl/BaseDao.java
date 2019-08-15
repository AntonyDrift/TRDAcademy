package com.jd2.TRDacademy.dao.impl;

import com.jd2.TRDacademy.dao.GenericDao;
import lombok.Getter;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Repository
public class BaseDao<T> implements GenericDao<T> {
    Class<T> clazz;

    private static Logger logger = Logger.getLogger(BaseDao.class);

    @PersistenceContext(name = "entityManagerTransaction")
    @Getter
    private EntityManager em;

    @Override
    public T add(T t) {
        em.persist(t);
        logger.info("Add: " + t);
        return t;
    }

    @Override
    public T get(Serializable id) {
        T t = em.find(clazz, id);
        logger.info("Get: " + t + "where id=" + id);
        return t;
    }

    @Override
    public List<T> getAll() {
        List<T> list = em.createQuery("FROM " + clazz.getSimpleName())
                .getResultList();
        logger.info("get list: " + list);
        return list;
    }

    @Override
    public T update(T t) {
        em.merge(t);
        logger.info("Update: " + t);
        return t;
    }

    @Override
    public void delete(Long id) {
        T t = em.find(clazz, id);
        em.remove(t);
        logger.info("Delete: " + t + "where id=" + id);
    }
}
