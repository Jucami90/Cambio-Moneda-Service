package com.tipocambio.dto;

public class ConversionResponse {

	private Double monto;
    private Double montoConTipoCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoCambio;
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getMontoConTipoCambio() {
		return montoConTipoCambio;
	}
	public void setMontoConTipoCambio(Double montoConTipoCambio) {
		this.montoConTipoCambio = montoConTipoCambio;
	}
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public Double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
    
	
    
}
