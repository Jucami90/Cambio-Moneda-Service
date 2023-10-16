package com.tipocambio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tipocambio.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

}
