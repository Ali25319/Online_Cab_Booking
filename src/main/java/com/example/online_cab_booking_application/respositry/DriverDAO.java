package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface DriverDAO extends JpaRepository<Driver, Integer> {
    public Optional<Driver> findByUserUsername(String name);

    public Optional<Driver>findByUserMobile(String mobile);

    public List<Driver> findByCabAvailable(String bool);

    //		@Query("select * from Driver b  where b.rating>4.5")
    public List<Driver>findByRatingGreaterThan(float r);

}
