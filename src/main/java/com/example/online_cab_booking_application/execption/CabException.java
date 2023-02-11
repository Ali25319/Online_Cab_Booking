package com.example.online_cab_booking_application.execption;

public class CabException extends RuntimeException{
    public CabException() {
    }

    public CabException(String message) {
        super(message);
    }
}
