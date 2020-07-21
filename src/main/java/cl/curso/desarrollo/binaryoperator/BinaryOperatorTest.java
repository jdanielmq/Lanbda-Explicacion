package cl.curso.desarrollo.binaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {

		BinaryOperator<Integer> boperator = (num1, num2) -> num1 * num2;
		
		int resultado = boperator.apply(10, 20);
		
		System.out.println("resultado :" + resultado);
		
		BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
		
		resultado = bOperatorMin.apply(10, 20);
		
		System.out.println("resultado de min" + resultado);
		
		BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
		
		resultado = bOperatorMax.apply(30, 40);
		
		System.out.println("resultado de max" + resultado);
		
			
		
		
		
		
		

	}

}
