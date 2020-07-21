package cl.curso.desarrollo.unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {

		List<Integer> listaNumeroEnteros = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		List<Integer> listaActualizada = operatorUnary(x -> x * x, listaNumeroEnteros);
		
		listaActualizada.forEach(x -> System.out.println(x));
		

	}
	
	public static List<Integer> operatorUnary(UnaryOperator<Integer> unaryOperator , List<Integer> lista){
		
		List<Integer> listaActualizada = new ArrayList<Integer>(0);
		
		lista.forEach(num -> listaActualizada.add(unaryOperator.apply(num)));
		
		return listaActualizada;
		
	}

}
