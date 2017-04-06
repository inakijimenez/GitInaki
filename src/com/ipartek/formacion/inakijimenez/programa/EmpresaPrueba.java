package com.ipartek.formacion.inakijimenez.programa;

import com.ipartek.formacion.inakijimenez.tipos.Empleado;
import com.ipartek.formacion.inakijimenez.tipos.Empresa;
import com.ipartek.formacion.inakijimenez.tipos.Persona;
import com.ipartek.formacion.inakijimenez.tipos.Puesto;

public class EmpresaPrueba {

	public static void main(String[] args) {
		Empresa ipartek;

		// ipartek = new Empresa("Ipartek", new Persona(1, "Javier Lete"));

		Persona director = new Persona(1, "Javier García Lete");

		ipartek = new Empresa("Ipartek", director);

		System.out.println(ipartek);

		ipartek.getDirector().setNombre("Javier Lete García");

		System.out.println(ipartek);

		Persona directorNuevo = new Persona(2, "Iñaki Cáceres");

		ipartek.setDirector(directorNuevo);

		System.out.println(ipartek.getDirector().getNombre().toUpperCase());

		ipartek.setPersonaJunta(director, 0);
		ipartek.setPersonaJunta(directorNuevo, 1);

		System.out.println(ipartek.getPersonaJunta(1).getNombre());

		System.out.println(ipartek);

		ipartek.addPersona(new Persona(3, "Desconocido"));
		ipartek.addPersona(new Persona(4, "Anónimo"));
		ipartek.addPersona(new Persona(5, "Pepe Pérez"));

		System.out.println(ipartek);

		Puesto gerente = new Puesto("Gerente", 2500.00);
		Puesto currito = new Puesto("Currito", 600.00);
		Puesto chapuzas = new Puesto("Chapuzas", 800.00);

		ipartek.addEmpleado(new Empleado(new Persona(7, "Jon Mamon"), "21345135R", "345-2224-555", chapuzas));

		System.out.println(ipartek.getEmpleados());

	}

}
