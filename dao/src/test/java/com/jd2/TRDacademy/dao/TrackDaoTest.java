package com.jd2.TRDacademy.dao;


import com.jd2.TRDacademy.dao.impl.TrackDaoImpl;
import com.jd2.TRDacademy.entities.Track;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@ContextConfiguration(value = "/test-dao.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TrackDaoTest {

    @Autowired
    TrackDaoImpl trackDao;

    @Test
    public void getByType() {
        String trackType = "DRIFT";
        List<Track> trackList = trackDao.getByType(trackType);
        List<Track> actual = trackDao
                .getEm()
                .createQuery("FROM Track t WHERE t.trackType=:trackType")
                .setParameter("trackType", trackType)
                .getResultList();
        Assert.assertEquals(trackList, actual);
    }
}
