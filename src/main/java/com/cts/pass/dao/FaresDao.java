package com.cts.pass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pass.entities.Fares;


public interface FaresDao extends JpaRepository<Fares, Long>{
	

}
