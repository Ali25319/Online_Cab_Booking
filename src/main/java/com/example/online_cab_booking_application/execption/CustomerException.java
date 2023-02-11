package com.example.online_cab_booking_application.execption;

public class CustomerException extends RuntimeException{
    public CustomerException() {
        super();
    }

    public CustomerException(String message) {
        super(message);
    }
}
