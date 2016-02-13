package com.utng.asociaciones2;

//Credito hereda de pago
public class Credito extends Pago {
	// atributos de la clase
	private int numeroTdeCredito;
	private String tipo;
	//Atributo clase fecha exp
	private fechaDeExp fechaDeExp;
	private String nombre;

	// returns boolean hacerCargo
	public static boolean hacerCargo(double total) {
		return false;
	}

	// contructor de la clase
	public Credito() {
		super();
		// TODO Auto-generated constructor stub
	}

}
