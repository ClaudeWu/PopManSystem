package com.service.reservation.service;

import com.service.reservation.pojo.Reservation;

import java.util.List;

/**
 * reservation service interface
 */
public interface ReservationService {

    public List<Reservation> findAll();

    public Reservation findById(Integer id);

    public void add (Reservation reservation);

    public void update (Reservation reservation);

    public void deleteById(Integer id);

}
