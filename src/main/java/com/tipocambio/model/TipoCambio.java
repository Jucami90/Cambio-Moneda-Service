package com.tipocambio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipocambio")
public class TipoCambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codcambio")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "codMoneda",name = "monedaorigen")
	private Moneda monedaOrigen;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "codMoneda",name = "monedadestino")
	private Moneda monedaDestino;
	
	@Column(name = "montotipocambio")
	private Double montoTipoCambio;
	
	
	public Moneda getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(Moneda monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public Moneda getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(Moneda monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public Long getCódigo() {
		return codigo;
	}
	public void setCódigo(Long codigo) {
		this.codigo = codigo;
	}
	public Double getMontoTipoCambio() {
		return montoTipoCambio;
	}
	public void setMontoTipoCambio(Double tipoCambio) {
		this.montoTipoCambio = tipoCambio;
	}
	
	
}
