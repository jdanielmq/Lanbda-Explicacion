package cl.curso.desarrollo.supplier;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Supplier<String> i = () -> "Javier";
		
		System.out.println("El valor pasado es: " + i.get());

	}

}
