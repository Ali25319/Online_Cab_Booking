package com.example.online_cab_booking_application.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public class TripBooking {

    @Id
    @SequenceGenerator(name = "trip_generator", sequenceName = "trip_seq", allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trip_generator")
    private Integer tripbookingId;

    //	@NotNull
    private String fromLocation;
    //	@NotNull
    private String toLocation;
    private LocalDate fromDate;
    private LocalDate toDate;

    //	@NotNull
    private TripStatus status;

    private Double distanceInKm;

    private Double bill;

    @ManyToOne
//	@NotNull
    private Customer customer;

    @ManyToOne
//	@NotNull
    private Driver driver;

}
