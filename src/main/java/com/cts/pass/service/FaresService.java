package com.cts.pass.service;

import java.time.LocalDate;

import com.cts.pass.entities.Fares;


public interface FaresService {

	Fares getFare(String flightNumber, LocalDate flightDate);
	public Fares getFareByFlightId(long id);

}