package com.example.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.dto.Travel;

public interface TravelRepository extends JpaRepository<Travel, Long> {

}
