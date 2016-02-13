package acp.giti7073s.proyecto;

import java.util.Date;
import java.util.List;

public class Viaje {
	// Atributos
	private int limite;
	private boolean transporte;
	private String motivo;
	private Date fechaIda;
	private Date fechaVuelta;
	private String Estado;

	//Cardinalidad/relaciones
	private List<Comercial> realiza;
	private Presupuesto se_realiza_en;
	private Gasto gasto;

	// Contructor
	public Viaje(Comercial comercial, Presupuesto presupuesto, Gasto gasto) {
		// TODO Auto-generated constructor stub
	}

}
