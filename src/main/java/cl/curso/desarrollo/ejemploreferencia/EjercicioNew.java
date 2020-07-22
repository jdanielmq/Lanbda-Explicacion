package cl.curso.desarrollo.ejemploreferencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EjercicioNew {

	public static void main(String[] args) {

		List<String> numeros = Arrays.asList("10","10","15","15","25","30","40","6","30","25","10","15");
		
		/*aca ejacutados 2 expresiones lambda, el ejecutar el metodo me retorna una lista y ha esa lista le hago el foreach
		 * ambas expresiones lambda son estan llamando los metodos de un constructor*/
		getReults(numeros, Integer::new).forEach(System.out::println);
		//con expresiones lamba es : (numeroEsString) -> new Integer(numeroEsString)
		
		System.out.println("\n");
		
		/*aca nosotros hacemos aplicamos otro metodo por referencias de un constructor, es de la misma clase */
		getReults(numeros, Integer::new).forEach(num -> EjercicioNew.mutiplicarPor10(num));
		System.out.println("\n");
		
		/*aca nosotros hacemos aplicamos otro metodo por referencias de un constructor, es de la misma clase */
		getReults(numeros, Integer::new).forEach(EjercicioNew::mutiplicarPor10);		
		

	}
	
	public static List<Integer> getReults(List<String> listaNumeroString, Function<String, Integer > function){
		List<Integer> listaNumeroInteger = new ArrayList<>(0);
		listaNumeroString.forEach(strNum -> listaNumeroInteger.add(function.apply(strNum)));
		return listaNumeroInteger;
	}
	
	public static void mutiplicarPor10(int numero) {
		System.out.println("el nuemero es :" + numero  +"  multiplicado por 10 es: " + numero * 10);
	}

}
