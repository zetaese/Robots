package com.prueba;

public class Robot {
	private String nombre;
	private String tipo;
	private String serial;
	private String color;
	private String tamaño;
	private Arma arma;
	private Armadura armadura;
	
	public Robot(String nombre, String tipo, String color, String tamaño, Arma arma, Armadura armadura) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.serial = "R010101";
		this.color = color;
		this.tamaño = tamaño;
		this.arma = arma;
		this.armadura = armadura;
	}
	
	public String getNombre() {
		return nombre;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSerial() {
		return serial;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public Armadura getArmadura() {
		return armadura;
	}

	public Arma getArma() {
		return arma;
	}
	
	
	
	@Override
	public String toString() {
		return nombre +"-"+ serial + " color "+ color + ", tamaño " + getTamaño() +
				" Robot " + tipo  + " con arma " + getArma() + " y armadura "
				+ getArmadura();
	}
}
