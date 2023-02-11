package com.example.online_cab_booking_application.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserSession {

    @Id
    @SequenceGenerator(name="userSession_generator", sequenceName = "userSession_seq", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSession_generator")
    private Integer sessionId;

    @NotNull
    private Integer userId;

    private String uuid;

    @NotNull
    private String userType;
    private LocalDateTime sessionStartTime;
    private LocalDateTime sessionEndTime;

}
