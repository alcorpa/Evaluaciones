package acp.giti7073s.proyecto;

import java.util.Date;
import java.util.List;

public class Proyecto {
	
	//atributos
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;
	
	//Relaciones/Cardinalidad
	private List<Presupuesto> presupuestos;
	private Maquina maquinas;

	//contructor
	public Proyecto(Presupuesto presupuesto,Maquina maquina) {
		// TODO Auto-generated constructor stub
	}



}
