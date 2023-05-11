package com.restapiexample.model;

public class eliminar {

    String status;
    String message;

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public eliminar(String status, String message) {
        this.status = status;
        this.message = message;

    }
}
