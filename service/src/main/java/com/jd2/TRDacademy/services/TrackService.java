package com.jd2.TRDacademy.services;

import com.jd2.TRDacademy.entities.Track;

import java.util.List;

public interface TrackService extends GenericService<Track> {

    List<Track> getByType(String trackType);
}
