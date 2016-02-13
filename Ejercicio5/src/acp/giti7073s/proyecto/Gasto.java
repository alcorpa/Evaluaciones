package acp.giti7073s.proyecto;

import java.util.Date;
import java.util.List;

public class Gasto {
	// Atributos
	private String lugar;
	private Date fecha;
	private String lnt;
	private String tipo;
	private String justificante;
	private Double precio;

	// Cardinalidad
	private List<Viaje> pertenece;

	// contructor
	public Gasto(Viaje viaje) {
		// TODO Auto-generated constructor stub
	}

}
