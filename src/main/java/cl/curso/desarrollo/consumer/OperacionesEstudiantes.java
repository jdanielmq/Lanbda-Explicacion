package cl.curso.desarrollo.consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionesEstudiantes {
	
	public void aceptaTodos(List<Estudiante> estudiantes, Consumer<Estudiante> cons) {
		for (Estudiante estudiante : estudiantes) {
			cons.accept(estudiante);
		}
	}
	

}
