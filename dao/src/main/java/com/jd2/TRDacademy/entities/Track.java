package com.jd2.TRDacademy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tracks")
public class Track implements Serializable {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "track_id")
    private Long trackId;
    @Column(name = "track_name")
    private String trackName;
    @Column(name = "track_length")
    private Integer trackLength;
    @Column(name = "track_type")
    private String trackType;
}