package com.tipocambio.services;

import java.util.List;

import com.tipocambio.dto.ConversionRequest;
import com.tipocambio.dto.ConversionResponse;
import com.tipocambio.model.TipoCambio;

public interface TipoCambioService {

	public List<TipoCambio> getTipoCambio();
	
	public ConversionResponse getMontoCambio(ConversionRequest conversionRequest);
	
	public TipoCambio getTipoCambio(TipoCambio tipoCambio);
	
	public TipoCambio saveTipoCambio(TipoCambio tipoCambio);
	
}
