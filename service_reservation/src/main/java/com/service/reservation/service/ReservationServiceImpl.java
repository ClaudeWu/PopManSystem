package com.service.reservation.service;

import com.service.reservation.dao.ReservationDao;
import com.service.reservation.pojo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * reservation service implements
 */
@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationDao reservationDao;

    @Override
    public List<Reservation> findAll() {
        return reservationDao.findAll();
    }

    @Override
    public Reservation findById(Integer id) {
        return reservationDao.findById(id).get();
    }

    @Override
    public void add(Reservation reservation) {
        reservationDao.save(reservation);
    }

    @Override
    public void update(Reservation reservation) {
        reservationDao.save(reservation);
    }

    @Override
    public void deleteById(Integer id) {
        reservationDao.deleteById(id);
    }
}
