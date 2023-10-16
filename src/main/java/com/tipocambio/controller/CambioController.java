package com.tipocambio.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tipocambio.dto.ConversionRequest;
import com.tipocambio.dto.ConversionResponse;
import com.tipocambio.model.Moneda;
import com.tipocambio.model.TipoCambio;
import com.tipocambio.services.MonedaService;
import com.tipocambio.services.TipoCambioService;

@RestController
public class CambioController {

	
	private static final Logger log = LoggerFactory.getLogger(CambioController.class);

	@Autowired
	MonedaService monedaService;
	
	@Autowired
	TipoCambioService tipoCambioService;
	
	@GetMapping("/monedas")
	public List<Moneda> listaMonedas(){
		log.info("Obteniendo monedas");
		return monedaService.getMonedas();
	}
	
	@GetMapping("/tipocambios")
	public List<TipoCambio> listaTipoCambios(){
		log.info("Obteniendo tipos de cambio");
		return tipoCambioService.getTipoCambio();
	}
	
	@GetMapping("/cambio")
	public ResponseEntity<ConversionResponse> regalizarCambio(@RequestBody ConversionRequest conversionRequest){
		ConversionResponse conversionResponse = 
				tipoCambioService.getMontoCambio(conversionRequest);
		if(conversionResponse == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(conversionResponse);
	}
	
	@PutMapping("/actualizar-tipo-cambio")
	public ResponseEntity<TipoCambio> updateTipoCambio(@RequestBody TipoCambio tipoCambioRequest) {
		TipoCambio tipoCambio = tipoCambioService.getTipoCambio(tipoCambioRequest);
		
		if(tipoCambio != null) {
			tipoCambio.setMontoTipoCambio(tipoCambioRequest.getMontoTipoCambio());
			tipoCambio = tipoCambioService.saveTipoCambio(tipoCambio);
			return ResponseEntity.ok(tipoCambio);
		}
		
		return ResponseEntity.notFound().build();
		
		
	}
	
}
