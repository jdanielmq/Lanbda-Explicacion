package cl.curso.desarrollo.predicate;

import java.util.function.Predicate;

public class TestPredicate {
	
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (valor) -> valor > 0;
		
		System.out.println(predicate.test(-1));
		
		
	}
	

}
