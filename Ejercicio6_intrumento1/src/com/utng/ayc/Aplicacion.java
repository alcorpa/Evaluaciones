package com.utng.ayc;

public class Aplicacion {

	// metodos de comportamiento de la clase
	public void inicia() {

	}

	public void main() {

	}

	// contructor/dependencia
	public Aplicacion() {
		super();
		// TODO Auto-generated constructor stub
		Motor motor = new Motor();
		Coche coche = new Coche(null);
		Persona persona = new Persona(null);
	}

}
