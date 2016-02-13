package com.utng.ayc;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	//atributos
	public String nombre;
	//relaciones/cardinalidad
	private Coche coche;
	private List<Corazon> corazons;
	
	//contructor y composicion
	public Persona(String nom) {
		this.corazons = new ArrayList<Corazon>(); {
		};
		// TODO Auto-generated constructor stub
	}
	
	public void asignaCoche(Coche c){
		
	}

}
