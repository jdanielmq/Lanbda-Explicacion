package cl.curso.desarrollo.steams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamsArchivo {

	public static void main(String[] args) {

		Path path1 = Paths.get("texto.txt");
		try(Stream<String> lineas = Files.lines(path1)) {
			lineas.forEach(
						linea -> {
							System.out.println("Linea...");
							System.out.println(linea);
							System.out.println("\n");
						}
					);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		Path dir = Paths.get(".");
		System.out.printf(" %n El arbol de archivos del proyecto para %s es %n ", dir.toAbsolutePath());
		try (Stream<Path> paths =  Files.walk(dir)){
			
			paths.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
