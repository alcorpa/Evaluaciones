package acp.giti7073s.proyecto;

import java.util.List;

public class Cliente {
	// Atributos
	private String rfc;
	private String nombre;
	private String domicilio;
	private String telefono;
	private String email;

	// Cardinalidar 1:0
	private Proyecto proyecto;

	// Cardinalidad n
	private List<Presupuesto> solicita;

	// contructor
	public Cliente(Presupuesto presupuesto) {
		// TODO Auto-generated constructor stub
	}

}
