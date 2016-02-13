package com.utng.ayc;

import java.util.List;

public class Coche {

	// Relaciones/cardinalidades
	private Persona conductor;
	private List<Motor> motor;

	// Contructor/agregacion de motor
	public Coche(List<Motor> motor) {
		this.motor = motor;
		// TODO Auto-generated constructor stub
	}

	// metodos comportamiento de la clase
	public void asignaConductor() {

	}

	public void enciende() {

	}

	public void apaga() {

	}

	public void acelera() {

	}

	public void frena() {

	}

	public boolean estaEncendido() {
		return false;

	}

}
