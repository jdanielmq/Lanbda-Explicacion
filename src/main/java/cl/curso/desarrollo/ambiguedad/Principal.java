package cl.curso.desarrollo.ambiguedad;

public class Principal {

	public static void main(String[] args) {
		
		/*ejemplo 1*/
		CalculadoraInt calculadoraInt = (x,y) -> System.out.println(x + y);
		engine(calculadoraInt);
		
		/*ejemplo 2*/		
		engine((CalculadoraLong)(x, y) -> System.out.println(x + y));
		
		
		/*ejemplo 3*/
		engine((long x, long y) -> System.out.println(x + y));
		
		

	}

	public static void engine(CalculadoraInt calculate) {
		
	}
	
	public static void engine(CalculadoraLong calculate) {
		
	}
}
