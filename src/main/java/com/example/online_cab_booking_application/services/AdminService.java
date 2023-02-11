package com.example.online_cab_booking_application.services;

import com.example.online_cab_booking_application.DTO.AdminDTO;
import com.example.online_cab_booking_application.Model.Admin;
import com.example.online_cab_booking_application.Model.CompletedTrips;
import com.example.online_cab_booking_application.Model.Customer;
import com.example.online_cab_booking_application.Model.Driver;
import com.example.online_cab_booking_application.execption.AdminException;

import javax.security.auth.login.LoginException;
import java.util.List;

public interface AdminService {
    public Admin adminRegister(Admin admin) throws AdminException;

    public Admin updatePassword(AdminDTO dto, String username, String key);

    public Admin update(Admin admin, String Username, String key);

    public String deleteByUsername(AdminDTO dto, String key);

    public String logoutAdmin(String key) throws LoginException;

    public List<CompletedTrips> getTripsByCustomerId(Integer customerId, String key);

    public List<CompletedTrips> getAllTrips(String key);

    public List<Driver> getListOfDrivers(String key);

    public List<Customer> getListOfCustomers(String key);
}
