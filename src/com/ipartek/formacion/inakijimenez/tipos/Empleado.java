package com.ipartek.formacion.inakijimenez.tipos;

public class Empleado extends Persona {

	private String dni, numeroSeguridadSocial;
	private Puesto puesto;

	public Empleado(int id, String nombre, String dni, String numeroSeguridadSocial, Puesto puesto) {
		super(id, nombre);
		this.dni = dni;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.puesto = puesto;

	}

	public Empleado(Persona persona, String dni, String numeroSeguridadSocial, Puesto puesto) {
		this(persona.getId(), persona.getNombre(), dni, numeroSeguridadSocial, puesto);

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", puesto=" + puesto.getNombre() + "]";
	}

}
