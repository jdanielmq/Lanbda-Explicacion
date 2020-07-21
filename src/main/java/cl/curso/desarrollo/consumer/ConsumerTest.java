package cl.curso.desarrollo.consumer;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> cons = x -> System.out.println(x.toUpperCase());
		cons.accept("Juan Daniel");
		
		

	}

}
