package cl.curso.desarrollo.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import cl.curso.desarrollo.dto.Empleado;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado(1, "francisco", 150000,25,"Ventas"),
				new Empleado(2, "juan daniel", 250000,25,"Cobranzas"),
				new Empleado(3, "manuela", 298333,26,"Ventas"),
				new Empleado(4, "oscar", 569874,21,"Mostrador"),
				new Empleado(4, "filomeno", 569874,39,"Mostrador"),
				new Empleado(5, "felipe", 863344,29,"Ventas"),
				new Empleado(6, "ignacia", 987976,25,"Cobranzas"),
				new Empleado(7, "manuela", 542000,22,"Ventas"),
				new Empleado(8, "viviana", 620000,24,"Telemarketing"));
		
		
		
		/*
		 * 
		 * */
		System.out.println("vamos a ir a contruir las consultas...\n");
		
		
		/* clases con BiPredicate de 2 parametros que son edad y departamento*/
		Evaluador evaluador = new Evaluador();
		
		/*crear criterios*/
		/*Empleados de mostrador o ventas  mayores de 25 años*/
		BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad >= 25) && (departamento.equals("Ventas"));
		BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad >= 25) && (departamento.equals("Mostrador"));
		BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);
		
		List<Empleado> listaFinal = evaluador.evaluar(listaEmpleados, criterio);
		
		for (Empleado e : listaFinal) {
			System.out.println("Nombre: "+ e.getNombre() +" - Edad:"+ e.getEdad() +" Departamento:"+ e.getDepartamento());
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
