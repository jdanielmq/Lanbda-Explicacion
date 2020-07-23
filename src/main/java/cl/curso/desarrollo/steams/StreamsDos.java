package cl.curso.desarrollo.steams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsDos {

	public static void main(String[] args) {
		
		System.out.println("numero corelativo del 1 al 20");
		Stream<Long> primeroDiez = Stream
									.iterate(1L, n -> n + 1 )
									.limit(10);
		
		primeroDiez.forEach(System.out::println); 
		
		
		System.out.println("\n");
		System.out.println("iterate, filter, limit y foreach");
		Stream.iterate(1L, n -> n +1 )
		      .filter(n -> n % 2 == 0)
		      .limit(20)
		      .forEach(System.out::println);
		
		
		System.out.println("\n");
		System.out.println("iterate, filter, skip(salto primero y despues cuenta), limit  y foreach");
		Stream.iterate(1L, n -> n + 1)
			  .filter(n -> n % 2 == 1)
			  .skip(100)
			  .limit(20)
			  .forEach(System.out::println);
		
		
		System.out.println("\n");
		System.out.println("Creando numero random, con un limite 10");		
		Stream.generate(Math::random)
		      .limit(10)
		      .forEach(System.out::println);
		
		
		System.out.println("\n");
		System.out.println("numeros aleatorios con generate, limit y foreach");
		Stream.generate(Math::random)
		      .limit(10)
		      .forEach(System.out::println);
		
		
		System.out.println("\n");
		System.out.println("ocupando una instancia para llamar un ramdon especifico en un Streams, doubles(streams), limite y foreach.");	
		new Random().doubles()
		            .limit(10)
		            .forEach(System.out::println);
		
		
		
		

		
		
		
		
	}

}
