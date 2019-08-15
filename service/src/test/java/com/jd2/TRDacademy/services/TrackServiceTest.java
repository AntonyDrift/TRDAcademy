package com.jd2.TRDacademy.services;

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

@ContextConfiguration(value = "/service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class TrackServiceTest {

    @Autowired
    TrackService trackService;
    @Autowired
    TrackDaoImpl trackDao;

    @Test
    public void getByType() {
        List<Track> expected = trackService.getByType("DRIFT");
        List<Track> actual = trackDao
                .getEm()
                .createQuery("FROM Track t WHERE t.trackType=:trackType")
                .setParameter("trackType", "DRIFT")
                .getResultList();
        Assert.assertEquals(expected, actual);
    }




}
