package com.example.online_cab_booking_application.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {
    private String password;
    private String username;
    private String mobile;
    private String available;
}
