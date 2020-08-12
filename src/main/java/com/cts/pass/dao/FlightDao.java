package com.cts.pass.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pass.entities.Flight;

public interface FlightDao extends JpaRepository<Flight, Long>{

	public Flight findByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
}
