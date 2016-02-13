package acp.giti7073s.proyecto;

import java.util.Date;
import java.util.List;

public class Presupuesto {

	// atributos
	private Date fecha;
	private String descipcion;
	private Double importe;
	private String estado;
	// Relaciones
	private Cliente cliente;
	private List<DeptoComercial> valida;
	private Comercial calcula;
	private List<Viaje> tiene;
	private List<Proyecto> proyectos;

	public Presupuesto(IConsultarEstado consutarEstado, Cliente cliente, Viaje viaje, Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}

}
