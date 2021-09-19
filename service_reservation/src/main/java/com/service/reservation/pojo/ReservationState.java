package com.service.reservation.pojo;

/**
 * Reservation State
 */
public enum ReservationState {

    SUBMITTED ("Submitted"),
    PROCESSING ("In Processing"),
    FINISHED ("Finished");

    private String state;

    ReservationState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
