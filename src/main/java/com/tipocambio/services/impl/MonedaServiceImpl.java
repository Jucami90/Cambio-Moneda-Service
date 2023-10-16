package com.tipocambio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tipocambio.model.Moneda;
import com.tipocambio.repository.MonedaRepository;
import com.tipocambio.services.MonedaService;

@Service
public class MonedaServiceImpl implements MonedaService{

	@Autowired
	MonedaRepository monedaRepository;
	
	@Override
	public List<Moneda> getMonedas() {
		return monedaRepository.findAll();
	}

}
