package com.example.online_cab_booking_application.services;

import com.example.online_cab_booking_application.Model.Driver;

import java.util.List;

public interface DriverServices {
    public Driver newDriver(Driver driver);
    public List<Driver> getAllDriver(String key);
    public String removeDriver(String name,String key);
    public Driver updateDriver(Driver driver,String key);
    public String updateStatus(String newStatus, String key);

    public List<Driver> viewBestDriver(String key, float rating);

    public String logoutDriver(String key);
}
