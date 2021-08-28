package com.service.reservation.controller;

import com.service.reservation.pojo.Reservation;
import com.service.reservation.pojo.Result;
import com.service.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * reservation controller
 */
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    /**
     * find all
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        return new Result(true, "query is successful", reservationService.findAll());
    }

    /**
     * find one
     */
    @RequestMapping(value = "/{service_id}", method = RequestMethod.GET)
    public Result findById(@PathVariable Integer service_id) {
        return new Result(true, "query is successful", reservationService.findById(service_id));
    }

    /**
     * adding
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Reservation reservation) {
        reservationService.add(reservation);
        return new Result(true, "add successful");
    }

    /**
     * update
     */
    @RequestMapping(value = "/{service_id}", method = RequestMethod.PUT)
    public Result update(@RequestBody Reservation reservation, @PathVariable Integer service_id) {
        reservation.setService_id(service_id);
        reservationService.update(reservation);
        return new Result(true, "update successful");
    }

    /**
     * delete
     */
    @RequestMapping(value = "/{service_id}", method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable Integer service_id) {
        reservationService.deleteById(service_id);
        return new Result(true, "delete successful");
    }
}
