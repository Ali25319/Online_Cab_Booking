package com.example.online_cab_booking_application.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    @Id
    @SequenceGenerator(name="driver_generator", sequenceName = "driver_seq", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "driver_generator")
    private Integer driverId;

    private Float rating;

    @Column(unique = true)
    @NotNull
    private String licenceId;



    @Embedded
    private ModelUser user;

    @OneToOne(cascade = CascadeType.ALL)
    private Cab cab;

}
