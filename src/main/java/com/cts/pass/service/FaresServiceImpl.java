package com.cts.pass.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pass.dao.FlightDao;
import com.cts.pass.entities.Fares;
import com.cts.pass.entities.Flight;


@Service
public class FaresServiceImpl implements FaresService {
	@Autowired
	private FlightDao flightDao;
	
	@Override
	public Fares getFare(String flightNumber,LocalDate flightDate) {
		return flightDao.findByFlightNumberAndFlightDate(flightNumber, flightDate).getFares();
	}
	
	@Override
	public Fares getFareByFlightId(long id) {
		Flight flight=flightDao.findById(id).orElse(null);
		if(flight!=null) {
			return flight.getFares();
		}
		return null;
	}

}
