package com.brdz.api.checkIn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
    List<CheckIn> findCheckInById(Integer Id);
    List<CheckIn> findCheckInByTime(LocalDateTime checkInTime);
    List<CheckIn> findCheckInByResult(String result);
}
