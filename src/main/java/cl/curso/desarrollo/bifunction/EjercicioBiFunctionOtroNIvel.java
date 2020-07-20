package cl.curso.desarrollo.bifunction;

public class EjercicioBiFunctionOtroNIvel {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		String resp = calc.calc((x , y) -> ": " + (x * y) , 
								10, 
								60);
		
		System.out.println(resp.length());
		
	}
}
