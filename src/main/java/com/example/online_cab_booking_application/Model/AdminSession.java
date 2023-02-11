package com.example.online_cab_booking_application.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class AdminSession {
    @Id
    @SequenceGenerator(name="adminSession_generator", sequenceName = "adminSession_seq", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adminSession_generator")
    private Integer sessionId;
    private Integer adminId;
    private String uuid;
    private String userType;
    private LocalDateTime sessionStartTime;
    private LocalDateTime sessionEndTime;

}
