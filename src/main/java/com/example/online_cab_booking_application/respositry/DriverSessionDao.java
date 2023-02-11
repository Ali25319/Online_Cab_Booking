package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.DriverSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverSessionDao extends JpaRepository<DriverSession, Integer> {
    public Optional<DriverSession> findByDriverId(Integer userId);

    public Optional<DriverSession> findByUuid(String  uuid);
//	public Optional<DriverSession> findByDriverId(Integer id);
}
