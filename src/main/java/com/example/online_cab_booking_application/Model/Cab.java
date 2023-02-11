package com.example.online_cab_booking_application.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@Entity
public class Cab {
    @Id
    @SequenceGenerator(name="cab_generator", sequenceName = "cab_seq", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cab_generator")
    private Integer id;

    private Double perKmRate;

    @NotNull
    private CabType cabType;

    private String available;
}
