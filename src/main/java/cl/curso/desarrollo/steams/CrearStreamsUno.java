package cl.curso.desarrollo.steams;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import ch.qos.logback.classic.spi.STEUtil;
import cl.curso.desarrollo.pojo.Estudiante;


public class CrearStreamsUno {

	public static void main(String[] args) {

		Stream<String> streams1 = Stream.of("curso de programaciòn");
		streams1.forEach(System.out::println);
		
		
		Stream<String> streams2 = Stream.of("prueba","prueba2","prueba3");
		streams2.forEach(System.out::println);
		
		String[] arreglo = {"c++","java","c#","ruby","react"};
		Stream<String> streams3 = Stream.of(arreglo);
		streams3.forEach(System.out::println);
		
		Stream<Estudiante> streamsEstudiante = Stream.<Estudiante>builder()
												.add(new Estudiante("h1", 25, 1.98, 45.2))
												.add(new Estudiante("h2", 25, 1.71, 42.2))
												.build();
		
		streamsEstudiante.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));

		
		IntStream unoATreinta = IntStream.range(1, 31);
		unoATreinta.forEach(System.out::println);
		
		IntStream unoAVeinte = IntStream.rangeClosed(1, 20);
		unoAVeinte.forEach(System.out::println);
		
		
		
		
		

	}

}


