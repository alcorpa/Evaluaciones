package com.utng.asociaciones2;

import java.util.List;

public class Cliente {
	//atributos de la clase
	private int mesa;
	private int comensales;
	
	//relacion, cardinalidad con orden
	private List<Orden> orden;

	//contrusctor/relacion con orden
	public Cliente(List<Orden> orden) {
		super();
		// TODO Auto-generated constructor stub
	}

}
