package com.example.online_cab_booking_application.respositry;

import com.example.online_cab_booking_application.Model.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserSessionDAO extends JpaRepository<UserSession, Integer> {
    public Optional<UserSession> findByUserId(Integer userId);

    public Optional<UserSession> findByUuid(String  uuid);
}
