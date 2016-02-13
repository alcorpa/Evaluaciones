package acp.giti7073s.proyecto;

public class DeptoComercial implements IConsultarEstado {

	// Atributo
	private String responsable;

	// Comportamientos de la clase
	public static void asignarViaje() {

	}

	public static void asignarLimite() {

	}

	public static void validarPresupuesto() {

	}

	// relaciones
	private Comercial pertenece;
	private Presupuesto presupuesto;

	// String, return
	public String getResponsable() {
		return responsable;
	}

	// setter responsable
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	// contructor
	public DeptoComercial(Comercial comercials, Presupuesto presupuesto) {

		// TODO Auto-generated constructor stub
	}

}
