package com.tipocambio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cambio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codCambio;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "codcambio",name = "tipocambio")
	private TipoCambio tipoCambio;
	
	@Column(name = "monto")
	private Double monto;
	
	@Column(name = "montocambio")
	private Double montoCambio;
	
	@Column(name = "fechacambio")
	private String fechaCambio;
	
	public TipoCambio getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(TipoCambio tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public Long getCodigo() {
		return codCambio;
	}
	public void setCodigo(Long codigo) {
		this.codCambio = codigo;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Double getMontoCambio() {
		return montoCambio;
	}
	public void setMontoCambio(Double montoCambio) {
		this.montoCambio = montoCambio;
	}
	public String getFechaCambio() {
		return fechaCambio;
	}
	public void setFechaCambio(String fechaCambio) {
		this.fechaCambio = fechaCambio;
	}
	
	
}
