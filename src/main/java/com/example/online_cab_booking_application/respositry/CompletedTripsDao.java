package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.CompletedTrips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompletedTripsDao extends JpaRepository<CompletedTrips, Integer> {
    public List<CompletedTrips> findByCustomerId(Integer customerId);
}
