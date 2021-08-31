package com.service.reservation.pojo;

import java.io.Serializable;

/**
 * unified return data entity
 */

public class Result implements Serializable {

    // field
    private Boolean flag;   // successful or not
    private String message; // message for success or not
    private Object data;    // the return data

    // constructor
    public Result() {

    }

    public Result(Boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public Result(Boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    // method
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
