package cl.curso.desarrollo.predicate;

import java.util.Arrays;
import java.util.List;

import cl.curso.desarrollo.dto.Empleado;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado(1, "francisco", 150000,25,"Ventas"),
				new Empleado(2, "juan daniel", 250000,25,"Cobranzas"),
				new Empleado(3, "manuela", 298333,26,"Ventas"),
				new Empleado(4, "oscar", 569874,21,"Mostrador"),
				new Empleado(5, "felipe", 863344,29,"Ventas"),
				new Empleado(6, "ignacia", 987976,25,"Cobranzas"),
				new Empleado(7, "manuela", 542000,22,"Ventas"),
				new Empleado(8, "viviana", 620000,24,"Telemarketing"));
		
		
		Evaluador eval = new Evaluador();
		Functions functions = new Functions();
		
		System.out.println("Evaluar Empleado mayor a los 500.000 \n");
		List<Empleado> listaEmpleadoFiltrado = eval.evaluar(listaEmpleados, empleado -> empleado.getSalario() < 500000);
		for (Empleado e : listaEmpleadoFiltrado) 
			System.out.println("Nombre: "+ e.getNombre() +" - Salario:"+ e.getSalario());
			

		System.out.println("\nEvaluar Empleado que sea igual a un departamento \n");
		List<Empleado> listaEmpleadoDepartamento = eval.evaluar(listaEmpleados, empleado -> empleado.getDepartamento().equals("Cobranzas"));
		for (Empleado e : listaEmpleadoDepartamento) 
			System.out.println("Nombre: "+ e.getNombre() +" - Departamento:"+ e.getDepartamento());
		
		
		System.out.println("\nEmpleado que su nombre inicia con 'O':");
		List<Empleado> listaEmpleadoConLetra = eval.evaluar(listaEmpleados, empleado -> empleado.getNombre().startsWith("o"));
		for (Empleado e : listaEmpleadoConLetra) 
			System.out.println("Nombre: "+ e.getNombre());		
		

		
		System.out.println("\nEmpleado menor de 25 años:");
		List<Empleado> listaEmpleadoMenores = eval.evaluar(listaEmpleados, empleado -> empleado.getEdad() < 25 );
		for (Empleado e : listaEmpleadoMenores) {
			double nuevoSalario = functions.incrementoSalario(
					e,    //objeto empleado
					10,   // dato de incremento
					(salario, incremento) -> salario + (salario * (incremento / 100)));  //expresion lambda.
			
			System.out.println("Nombre: "+ e.getNombre() +" edad: "+ e.getEdad() +" Salario Actual: "+ e.getSalario() +" Salario Nuevo: "+ nuevoSalario);
			
		}
			
		
		
		
		
		
		
	}

}
