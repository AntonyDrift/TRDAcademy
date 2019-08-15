package com.jd2.TRDacademy.dao;

import com.jd2.TRDacademy.entities.Track;

import java.util.List;

public interface TrackDao extends GenericDao<Track> {

    List<Track> getByType(String trackType);
}
