package cl.curso.desarrollo.steams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import cl.curso.desarrollo.pojo.Estudiante;

public class StreamsArreglo {

	public static void main(String[] args) {

		IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10});
		intStream.forEach(System.out::println);
		
		Stream<String> nombresStream = Arrays.stream(new String[] {"Juan","Daniel","Isabel","Andrea","Rodrigo"});
		nombresStream.forEach(System.out::println);
		
		Set<String> lenguajesSet = new HashSet<>();
		lenguajesSet.add("Java");
		lenguajesSet.add("React");
		lenguajesSet.add("mongo");
		lenguajesSet.add("Spring");
		
		Stream<String> lenguajesStream = lenguajesSet.parallelStream();
		lenguajesStream.forEach(System.out::println);
		
		
		List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		listaEstudiantes.add(new Estudiante("Juan", 25, 1.75, 20.86));
		listaEstudiantes.add(new Estudiante("Daniel", 25, 1.75, 20.86));
		listaEstudiantes.add(new Estudiante("Muñoz", 25, 1.75, 20.86));
		listaEstudiantes.add(new Estudiante("Muñoz", 25, 1.75, 20.86));
		
		
		
		
		listaEstudiantes.stream()
						.forEach(estudiante -> System.out.println("Identificacion:"+estudiante.getIdentificacion()));
		
		
		Stream<Estudiante> listaStream = listaEstudiantes.stream();
		listaStream.forEach(estudiante -> System.out.println("Identificacion:"+estudiante.getIdentificacion()));

		
		
		
	}

}
