package com.service.reservation.pojo;

/**
 * Reservation State
 * 面向对象对原则
 */
public enum ReservationStateImpl implements ReservationState {

    NEW ("new", "new reservation"),
    RESERVED ("reserved", "reservation made"),
    CANCELED ("Finished", "reservation canceled"),
    NOSHOW ("no show", "not show up"),
    FULFILLED ("fulfilled", "reservation complete"),
    CLOSED ("closed", "reservation closed"),
    EXTEND ("extension", "reservation extended");

    private String state;
    private String name;

    ReservationStateImpl(String state, String name) {
        this.name = name;
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getName() { return name;}

}
