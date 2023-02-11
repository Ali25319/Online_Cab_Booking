package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabDao extends JpaRepository<Cab, Integer> {

}
