package com.prueba;

public class Armadura {
	private String tipo; 
	private String serie;
	
	public Armadura() {
		this.tipo = "escudo";
		this.serie = "A600022";
	}

	public Armadura(String tipo, String serie) {
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
