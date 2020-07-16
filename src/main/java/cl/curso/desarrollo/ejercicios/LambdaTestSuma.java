package cl.curso.desarrollo.ejercicios;

public class LambdaTestSuma {
	
	public static void main(String[] args) {
		
		Operations operacion = (num1,num2) -> System.out.println(num1 + num2);
		
		LambdaTestSuma suma = new LambdaTestSuma();
		
		
		suma.miMetodo((num1,num2) -> System.out.println(num1 * num2), 5, 5);
		
		
		suma.miMetodo(operacion, 25, 60);

	}
	
	
	public void miMetodo(Operations operacion, int num1, int num2) {
		
		operacion.imprimirOperaciones(num1, num2);
		
		
	}

}
