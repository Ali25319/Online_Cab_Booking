package com.example.online_cab_booking_application.services;

import com.example.online_cab_booking_application.Model.TripBooking;
import com.example.online_cab_booking_application.respositry.TripbookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripBookingServicesImpl implements TripBookingServices {
    @Autowired
    TripbookingDao tripDao;
    @Override
    public TripBooking newTrip(TripBooking trip) {

        return tripDao.save(trip);

    }
}
