package cl.curso.desarrollo.steams;

import java.util.Arrays;
import java.util.List;

public class PrincipalStreams {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		
		int suma = numeros
				.parallelStream()
				.filter(n -> n % 2 == 1)
				.map(n -> n*n)
				.reduce(0,  Integer::sum);
		
		System.out.println("resultado : " + suma);
				

		
		
	}

}
