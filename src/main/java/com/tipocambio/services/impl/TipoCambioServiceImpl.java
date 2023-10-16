package com.tipocambio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipocambio.dto.ConversionRequest;
import com.tipocambio.dto.ConversionResponse;
import com.tipocambio.model.TipoCambio;
import com.tipocambio.repository.TipoCambioRepository;
import com.tipocambio.services.TipoCambioService;

@Service
public class TipoCambioServiceImpl implements TipoCambioService{
	
	
	@Autowired
	TipoCambioRepository tipoCambioRepository;
	
	@Override
	public List<TipoCambio> getTipoCambio() {
		return tipoCambioRepository.findAll();
	}

	@Override
	public ConversionResponse getMontoCambio(ConversionRequest conversionRequest) {
		Double montoCambio = 0.0;
		ConversionResponse conversionResponse = new ConversionResponse();
		try {
			
			List<Double> montoTipoCambio = 
					tipoCambioRepository.findMontoCambioByMonedaOrigenAndMonedaDestino(
							conversionRequest.getMonedaOrigen(), 
							conversionRequest.getMonedaDestino());
			
			montoCambio = conversionRequest.getMonto() * montoTipoCambio.get(0);
			
			conversionResponse.setMonto(conversionRequest.getMonto());
			conversionResponse.setMontoConTipoCambio(montoCambio);
			conversionResponse.setTipoCambio(montoTipoCambio.get(0));
			conversionResponse.setMonedaDestino(conversionRequest.getMonedaDestino());
			conversionResponse.setMonedaOrigen(conversionRequest.getMonedaOrigen());
			
		}catch (IndexOutOfBoundsException e) {
			conversionResponse = null;
		}
		
		return conversionResponse;
		
	}

	@Override
	public TipoCambio getTipoCambio(TipoCambio tipoCambioRequest) {
		TipoCambio tipoCambio = new TipoCambio();
		tipoCambio = tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(
				tipoCambioRequest.getMonedaOrigen(),
				tipoCambioRequest.getMonedaDestino());

		return tipoCambio;
	}

	@Override
	public TipoCambio saveTipoCambio(TipoCambio tipoCambio) {
		return tipoCambioRepository.save(tipoCambio);
	}

}
