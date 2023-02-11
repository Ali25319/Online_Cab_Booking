package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.AdminSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminSessionDao extends JpaRepository<AdminSession, Integer> {
    public Optional<AdminSession> findByAdminId(Integer userId) ;

    public Optional<AdminSession> findByUuid(String  uuid);
}
