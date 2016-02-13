package com.utng.asociaciones2;

import java.util.List;

public class Orden {
	// atributos
	private int hora;
	private String mesero;
	// relaciones, cliente, bebida, platillo
	private Cliente cliente;
	private List<Bebida> bebida;
	private List<Platillo> platillo;
	private Pago pago;

	// contructor y agragcion de bebida y platillo
	public Orden(List<Bebida> bebida, List<Platillo> platillo) {
		this.bebida = bebida;
		this.platillo = platillo;
		// TODO Auto-generated constructor stub
	}

}
