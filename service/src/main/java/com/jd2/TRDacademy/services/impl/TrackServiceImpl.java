package com.jd2.TRDacademy.services.impl;

import com.jd2.TRDacademy.dao.TrackDao;
import com.jd2.TRDacademy.entities.Track;
import com.jd2.TRDacademy.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TrackServiceImpl extends BaseService<Track> implements TrackService {

    @Autowired
    TrackDao trackDao;

    @Override
    public List<Track> getByType(String trackType) {
        return trackDao.getByType(trackType);
    }
}