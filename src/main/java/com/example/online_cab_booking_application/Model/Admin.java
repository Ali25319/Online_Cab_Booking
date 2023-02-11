package com.example.online_cab_booking_application.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @SequenceGenerator(name="admin_generator", sequenceName = "admin_generator", allocationSize=50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_generator")
    private Integer adminId;
    @Embedded
    private ModelUser user;
}
