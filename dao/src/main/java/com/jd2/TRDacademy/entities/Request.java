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
@Table(name = "requests")
public class Request implements Serializable {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "request_id")
    private Long requestId;
    @Column(name = "request_date")
    private String requestDate;
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "car_id")
    private Long carId;
    @Column(name = "track_id")
    private Long trackId;
    @Column(name = "request_status")
    private Integer requestStatus;
    @Column(name = "cost")
    private Integer cost;
}