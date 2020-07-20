package cl.curso.desarrollo.ambiguedad;

public class Main {
	

	public static void main(String[] args) {

		create().calculate(100, 20);

	}
	
	private static CalculadoraLong create() {
		long var = 50;
		return (x, y) -> System.out.println(x / y - var);
	}

}

