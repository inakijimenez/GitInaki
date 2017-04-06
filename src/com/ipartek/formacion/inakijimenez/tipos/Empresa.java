package com.ipartek.formacion.inakijimenez.tipos;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
	private String nombre;
	private Persona director;
	private Persona[] junta = new Persona[5];
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public Empresa(String nombre, Persona director) {
		super();
		this.nombre = nombre;
		this.director = director;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta) + ", personas=" + personas + "]";
	}

	public void setPersonaJunta(Persona persona, int posicion) {
		junta[posicion] = persona;
	}

	public Persona getPersonaJunta(int posicion) {
		return junta[posicion];
	}

	public void addPersona(Persona persona) {
		personas.add(persona);
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public double getTotalSueldoBruto() {
		double totalSueldoBruto = 0.0;
		for (Empleado e : empleados) {
			totalSueldoBruto += e.getPuesto().sueldoBase;
		}
		return totalSueldoBruto;
	}
}
