package com.example.online_cab_booking_application.services;

import com.example.online_cab_booking_application.DTO.CustomerDTO;
import com.example.online_cab_booking_application.Model.CompletedTrips;
import com.example.online_cab_booking_application.Model.Customer;
import com.example.online_cab_booking_application.Model.Driver;
import com.example.online_cab_booking_application.Model.TripBooking;
import com.example.online_cab_booking_application.execption.CustomerException;
import com.example.online_cab_booking_application.execption.TripException;

import java.util.List;

public interface CustomerService {
    public Customer register(Customer user) throws CustomerException;

    public List<Customer> getCustomer();

    public Customer updatePassword(CustomerDTO dto, String mobile, String key) throws CustomerException;

    public String deleteCustomer(CustomerDTO dto, String key) throws CustomerException;

    public Customer updateCustomer(Customer customer,String mobile, String key) throws CustomerException;

    public List<Driver> getAvailableDrivers();

    public List<Driver> generalListOfDrivers();

    public TripBooking bookTrip(TripBooking trip, String key  );

    public String cancelTrip(String key, Integer tripId) throws TripException;

    public String logoutCustomer(String key);

    public String completeTrip(String key, Integer tripId);

    public List<CompletedTrips> alltripHistory(String key);

    public TripBooking updateTrip(TripBooking trip, String key);
}
