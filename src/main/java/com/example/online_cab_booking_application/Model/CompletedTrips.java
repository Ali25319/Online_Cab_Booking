package com.example.online_cab_booking_application.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class CompletedTrips {


    @Id
    @SequenceGenerator(name = "trip_generator", sequenceName = "trip_seq", allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trip_generator")
    private Integer completedTripsId;
    private Integer customerId;
    private Integer driverId;
    private Integer tripbookingid;
    private String fromLocation;
    private String toLocation;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double bill;
    private Double distanceInKM;
    @Enumerated
    private TripStatus status;

}
