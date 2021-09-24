package com.service.reservation.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * reservation entity
 */
@Entity
@Table(name = "service_reservation")
public class Reservation implements Serializable {

    // field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String detail;
    private Date addTime;
    private ReservationState state;

    // method
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ReservationState getState() {
        return state;
    }

    public void setState(ReservationState state) {
        this.state = state;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

}
