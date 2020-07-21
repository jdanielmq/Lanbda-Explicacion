package cl.curso.desarrollo.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

import cl.curso.desarrollo.dto.Empleado;

public class Evaluador {
	
	public List<Empleado> evaluar(List<Empleado> listaEmpleados, BiPredicate<Integer, String>  eval ){
	
		/*evaluando por edad y por departamento*/
		List<Empleado> listaNueva = new ArrayList<>(0);
		for (Empleado empleado : listaEmpleados) {
			if(eval.test(empleado.getEdad(),empleado.getDepartamento())){
				listaNueva.add(empleado);
			}
		}
		return listaNueva;
	}

}
