package com.tipocambio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tipocambio.model.Moneda;
import com.tipocambio.model.TipoCambio;

public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long>{

	@Query(value = "SELECT t.montotipocambio "
			+ "FROM TipoCambio t "
			+ "WHERE t.monedaOrigen = :monedaOrigenCodMoneda AND t.monedaDestino = :monedaDestinoCodMoneda", nativeQuery = true)
    List<Double> findMontoCambioByMonedaOrigenAndMonedaDestino(
    		@Param("monedaOrigenCodMoneda") String codMonedaOrigen, 
    		@Param("monedaDestinoCodMoneda") String codMonedaDestino);
	
	TipoCambio findByMonedaOrigenAndMonedaDestino(Moneda monedaOrigen, Moneda monedaDestino);
}
