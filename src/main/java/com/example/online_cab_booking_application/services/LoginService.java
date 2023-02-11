package com.example.online_cab_booking_application.services;

import com.example.online_cab_booking_application.DTO.LoginDTO;
import com.example.online_cab_booking_application.Model.AdminSession;
import com.example.online_cab_booking_application.Model.DriverSession;
import com.example.online_cab_booking_application.Model.UserSession;

public interface LoginService {
    public AdminSession loginAdmin(LoginDTO dto);

    public UserSession loginCustomer(LoginDTO customer);

    public DriverSession loginDriver(LoginDTO dto);
}
