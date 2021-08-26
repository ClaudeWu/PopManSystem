package com.service.reservation.dao;

import com.service.reservation.pojo.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * reservation dao interface
 */

public interface ReservationDao extends JpaRepository<Reservation, Integer> {
    
}
