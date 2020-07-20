package cl.curso.desarrollo.predicate;

import java.util.function.BiFunction;

import cl.curso.desarrollo.dto.Empleado;

public class Functions {
	
	
	public double incrementoSalario(Empleado empleado, double incremento, BiFunction<Double, Double, Double> biFunction) {
		return biFunction.apply(empleado.getSalario(), incremento);
	}

}
