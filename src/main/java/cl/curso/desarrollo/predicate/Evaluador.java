package cl.curso.desarrollo.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import cl.curso.desarrollo.dto.Empleado;

public class Evaluador {
	
	public  List<Empleado> evaluar(List<Empleado> listEmpl, Predicate<Empleado> predicate) {
		List<Empleado> listaEmpleados = new ArrayList<>(0);
		for (Empleado empleado : listEmpl) {
			if(predicate.test(empleado)){
				listaEmpleados.add(empleado);
			}
		}
		return listaEmpleados;
	}
	
	public  List<Empleado> evaluarAlContario(List<Empleado> listEmpl, Predicate<Empleado> predicate) {
		List<Empleado> listaEmpleados = new ArrayList<>(0);
		for (Empleado empleado : listEmpl) {
			if(predicate.negate().test(empleado)){
				listaEmpleados.add(empleado);
			}
		}
		return listaEmpleados;
	}

}
