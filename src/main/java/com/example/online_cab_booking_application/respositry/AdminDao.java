package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
    public Optional<Admin> findByUserUsername(String username) ;

    public Optional<Admin> findByUserMobile(String username) ;

}
