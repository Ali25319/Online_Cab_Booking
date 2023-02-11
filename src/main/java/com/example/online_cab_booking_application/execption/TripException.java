package com.example.online_cab_booking_application.execption;

public class TripException extends RuntimeException{
    public TripException() {
    }

    public TripException(String message) {
        super(message);
    }
}
