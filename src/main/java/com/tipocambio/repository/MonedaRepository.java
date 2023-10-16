package com.tipocambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tipocambio.model.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, String>{

	
}
