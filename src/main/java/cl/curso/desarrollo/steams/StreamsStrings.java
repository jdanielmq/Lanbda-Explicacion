package cl.curso.desarrollo.steams;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StreamsStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		IntStream intStream = entrada.chars();
		intStream.filter(n -> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
				  .forEach(n -> System.out.println((char)n)); 
		
		
		String str = "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
		Pattern.compile(", ")
		       .splitAsStream(str)
		       .forEach(System.out::println);
		
		
		
		

	}

}
