package cl.curso.desarrollo.function;

import org.springframework.cglib.core.internal.Function;

public class TestFunction {

	public static void main(String[] args) {

		/*interface funcional sin expresiones lambda*/
//		Function<Integer, String> convertidorUno = new Function<Integer, String>() {
//			
//			/*metodo abstracto de la interfaces funtion*/
//			@Override
//			public String apply(Integer arg0) { 
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		
		/*interface funcional con expresiones lambda*/
		Function<Integer, String> convertidor =  x -> Integer.toString(x);
		System.out.println(convertidor.apply(3).length());
		System.out.println(convertidor.apply(20).length());
		
		/*funciones que recibe un tipo de datos (int) y retorna otro tipo de datos (String)*/
		
		

	}

}
