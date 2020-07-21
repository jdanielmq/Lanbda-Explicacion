package cl.curso.desarrollo.bipredicate;

import java.util.function.BiPredicate;

public class TestBiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (x , y) -> x < y;
		
		System.out.println(bp.test(20, 19));


	}

}
