package cl.curso.desarrollo.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Principal {

	public static void main(String[] args) {

		List<Estudiante> listaEstudiantes = Arrays.asList(
				new Estudiante("francisco", 6),
				new Estudiante("manuel", 5),
				new Estudiante("perro", 4),
				new Estudiante("loco", 3),
				new Estudiante("juan", 3.5),
				new Estudiante("daniel", 4),
				new Estudiante("judas", 5.5),
				new Estudiante("sebastian", 4.5),
				new Estudiante("nacho", 5),
				new Estudiante("fabricio", 6),
				new Estudiante("felix", 6.5),
				new Estudiante("tomas", 4.5)
				
				);
		
			OperacionesEstudiantes oe = new OperacionesEstudiantes();
//			
//			Consumer<Estudiante> consu1 = e -> System.out.println("Nombre:"+ e.getNombre() +" Calificaciòn :"+ e.getCalificacion());
//			
//			Consumer<Estudiante> consu2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
//			
//			oe.aceptaTodos(listaEstudiantes, consu2);
//			
//			oe.aceptaTodos(listaEstudiantes, consu1);
			
			
			System.out.println("Estuadiantes con calificaciones sin Actualizar:");
			Consumer<Estudiante> consu1 = e -> System.out.println("Nombre:"+ e.getNombre() +" Calificaciòn :"+ e.getCalificacion());
			oe.aceptaTodos(listaEstudiantes, consu1);
			Consumer<Estudiante> consu2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
			
			System.out.println("Estuadiantes con calificaciones actualizada:");
			Consumer<Estudiante> consu3 = consu2.andThen(consu1);
			oe.aceptaTodos(listaEstudiantes, consu3);
			
			
			
		

	}

}
