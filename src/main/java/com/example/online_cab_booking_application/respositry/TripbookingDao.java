package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripbookingDao extends JpaRepository<TripBooking, Integer> {

}
