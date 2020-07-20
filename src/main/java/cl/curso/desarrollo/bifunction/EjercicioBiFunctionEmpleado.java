package cl.curso.desarrollo.bifunction;

import java.util.Arrays;
import java.util.List;

import cl.curso.desarrollo.dto.Empleado;

public class EjercicioBiFunctionEmpleado {
	
	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado(23456432, "Francisco Daniel", 25469333),
				new Empleado(4567865, "Juanito", 254693),
				new Empleado(23456432, "manuela", 98767876),
				new Empleado(23456432, "oscar", 857455),
				new Empleado(23456432, "felipe", 863344),
				new Empleado(23456432, "ignacia", 987976),
				new Empleado(23456432, "manuela", 98767876),
				new Empleado(23456432, "viviana", 857995));

		CalculadoraEmpleado cal = new CalculadoraEmpleado();
		
		List<Double> salarios =  cal.calc((salario,incremento) -> salario + (salario * (incremento/100)), listaEmpleados, 10.0);
		
		for (Double monto : salarios) {
			System.out.println(monto);
		}
		
	}
	

	
	
	
	
	
}
