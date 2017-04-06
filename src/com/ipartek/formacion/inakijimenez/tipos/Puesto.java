package com.ipartek.formacion.inakijimenez.tipos;

public class Puesto {

	String nombre;
	double sueldoBase;

	public Puesto(String nombre, double sueldoBase) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return String.format("nombre= %s, sueldoBase= %.2f", nombre, sueldoBase);
	}

}
