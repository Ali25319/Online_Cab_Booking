package com.example.online_cab_booking_application.execption;

public class LoginException extends RuntimeException{
    public LoginException() {
        // TODO Auto-generated constructor stub
    }

    public LoginException(String sms) {

        super(sms);
        // TODO Auto-generated constructor stub
    }
}
