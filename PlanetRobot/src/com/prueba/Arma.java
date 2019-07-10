package com.prueba;

public class Arma {
	private String tipo; 
	private String serie;
	
	public Arma() {
		this.tipo = "laser";
		this.serie = "W100102";
	}

	public Arma(String tipo, String serie) {
		super();
		this.tipo = tipo;
		this.serie = serie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSerie() {
		return serie;
	}

	@Override
	public String toString() {
		return tipo + "-" + serie;
	}

}
