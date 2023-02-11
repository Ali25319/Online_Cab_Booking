package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByUserMobile(String mobile);
}
