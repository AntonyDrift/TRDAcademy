package com.jd2.TRDacademy.dao.impl;

import com.jd2.TRDacademy.dao.TrackDao;
import com.jd2.TRDacademy.entities.Track;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrackDaoImpl extends BaseDao<Track> implements TrackDao {

    private static Logger logger = Logger.getLogger(TrackDaoImpl.class);

    public TrackDaoImpl() {
        super();
        clazz = Track.class;
    }

    @Override
    public List<Track> getByType(String trackType) {
        List<Track> tracks = getEm()
                .createQuery("FROM Track t WHERE t.trackType=:trackType")
                .setParameter("trackType", trackType)
                .getResultList();
        logger.info("get " + tracks + " where track type=" + trackType);
        return tracks;
    }
}