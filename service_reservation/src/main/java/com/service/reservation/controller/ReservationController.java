package com.service.reservation.controller;

import com.service.reservation.pojo.Reservation;
import com.service.reservation.pojo.Result;
import com.service.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * reservation controller
 *
 * request mapping backup @RequestMapping("/reservation")
 */

@RestController
@RequestMapping("/api")
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
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Result findById(@PathVariable Integer id) {
        return new Result(true, "query is successful", reservationService.findById(id));
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
    @RequestMapping( method = RequestMethod.PUT, value = "/{id}")
    public Result update(@RequestBody Reservation reservation, @PathVariable Integer id) {
        reservation.setId(id);
        reservationService.update(reservation);
        return new Result(true, "update successful");
    }

    /**
     * delete
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{service_id}")
    public Result deleteById(@PathVariable Integer service_id) {
        reservationService.deleteById(service_id);
        return new Result(true, "delete successful");
    }
}
