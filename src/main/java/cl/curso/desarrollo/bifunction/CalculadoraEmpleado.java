package cl.curso.desarrollo.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import cl.curso.desarrollo.dto.Empleado;

public class CalculadoraEmpleado {
	public List<Double> calc(BiFunction<Double, Double, Double> bi, List<Empleado> lista, Double incremento) {
		List<Double> listaSalarios = new ArrayList<Double>(0);
		
		for (Empleado empleado : lista) {
			listaSalarios.add(bi.apply(empleado.getSalario(), incremento));
		}
		return listaSalarios;
	}

}
