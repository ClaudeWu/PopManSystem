package com.service.reservation.controller;

import com.service.reservation.pojo.Reservation;
import com.service.reservation.pojo.ReservationState;
import com.service.reservation.pojo.Result;
import com.service.reservation.service.ReservationServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ReservationControllerTest {

    @InjectMocks
    private ReservationController underTest;
    @Mock
    private ReservationServiceImpl reservationService;
    @Mock
    private Reservation reservation;

    @BeforeEach
    void setUp() {

    }
    
    @Test
    void findAll() {
        // data
        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setAddTime(new Date());
        reservation.setType("Hardware Replacement");
        reservation.setState(ReservationState.FINISHED);
        reservation.setDetail("The light of living room was not working.");

        List<Reservation> testDate = new ArrayList<>();
        testDate.add(reservation);
        // when
        when(reservationService.findAll()).thenReturn(testDate);
        Result result = underTest.findAll();

        Assert.assertEquals(result.getFlag(), true);
        Assert.assertEquals(result.getMessage(), "query is successful");
        Assert.assertEquals((List<Reservation>) result.getData(), testDate);

        verify(reservationService).findAll();
    }

    @Test
    void findById() {
        // data
        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setAddTime(new Date());
        reservation.setType("Hardware Replacement");
        reservation.setState(ReservationState.FINISHED);
        reservation.setDetail("The light of living room was not working.");

        when(reservationService.findById(reservation.getId())).thenReturn(reservation);

        Result result = underTest.findById(reservation.getId());

        Assert.assertEquals(result.getFlag(), true);
        Assert.assertEquals(result.getMessage(), "query is successful");
        Assert.assertEquals((Reservation)result.getData(), reservation);

        verify(reservationService).findById(reservation.getId());
    }

    @Test
    void add() {
        // data
        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setAddTime(new Date());
        reservation.setType("Hardware Replacement");
        reservation.setState(ReservationState.FINISHED);
        reservation.setDetail("The light of living room was not working.");

        Result result = underTest.add(reservation);

        Assert.assertEquals(result.getFlag(), true);
        Assert.assertEquals(result.getMessage(), "add successful");

        verify(reservationService).add(reservation);
    }

    @Test
    void update() {
        // data
        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setAddTime(new Date());
        reservation.setType("Hardware Clean");
        reservation.setState(ReservationState.PROCESSING);
        reservation.setDetail("The light of living room was not working.");

        Result result = underTest.update(reservation, reservation.getId());

        Assert.assertEquals(result.getFlag(), true);
        Assert.assertEquals(result.getMessage(), "update successful");

        verify(reservationService).update(reservation);
    }

    @Test
    void deleteById() {
        // data
        Reservation reservation = new Reservation();
        reservation.setId(1);
        reservation.setAddTime(new Date());
        reservation.setType("Hardware Replacement");
        reservation.setState(ReservationState.FINISHED);
        reservation.setDetail("The light of living room was not working.");;

        Result result = underTest.deleteById(reservation.getId());

        Assert.assertEquals(result.getFlag(), true);
        Assert.assertEquals(result.getMessage(), "delete successful");

        verify(reservationService).deleteById(reservation.getId());
    }
}