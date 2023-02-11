package com.example.online_cab_booking_application.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class DriverSession {
    @Id
    @SequenceGenerator(name="driverSession_generator", sequenceName = "driverSession_seq", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "driverSession_generator")
    private Integer sessionId;
    private Integer driverId;
    private String uuid;
    private String userType;
    private LocalDateTime sessionStartTime;
    private LocalDateTime sessionEndTime;

}
