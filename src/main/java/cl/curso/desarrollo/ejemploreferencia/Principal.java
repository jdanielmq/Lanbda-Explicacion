package cl.curso.desarrollo.ejemploreferencia;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import cl.curso.desarrollo.dto.PersonaReferencia;
import cl.curso.desarrollo.utilerias.ProveedorComparaciones;

public class Principal {

	public static void main(String[] args) {

		List<PersonaReferencia> listaPersonas = Arrays.asList(new PersonaReferencia("juan",39,"ertyui@hotmal.com"),
													new PersonaReferencia("pedro",21,"pedro@hotmal.com"),
													new PersonaReferencia("andrea",18,"andrea@hotmal.com"),
													new PersonaReferencia("seba",31,"seba@hotmal.com"),
													new PersonaReferencia("pancho",25,"pancho@hotmal.com"),
													new PersonaReferencia("angelica",29,"angelica@hotmal.com"),
													new PersonaReferencia("pamela",21,"pamela@hotmal.com"),
													new PersonaReferencia("maria",37,"maria@hotmal.com")
				);
		
		
		System.out.println("Personas sin ordernar");
		listaPersonas.forEach(p -> System.out.println(p));
		System.out.println("\n");
		
		System.out.println("Personas ordenadas por edad");
		Collections.sort(listaPersonas, (persona1, persona2) -> persona1.getEdad().compareTo(persona2.getEdad()));
		listaPersonas.forEach(p -> System.out.println(p));
		System.out.println("\n");
		
		System.out.println("Personas ordenadas por edad otra forma, cuando la expresion lambda invoca una un metodo que ya existe en la clase.");
		Collections.sort(listaPersonas, (p1, p2) -> PersonaReferencia.compararPorEdad(p1, p2));
		listaPersonas.forEach(p -> System.out.println(p));
		System.out.println("\n");
		
		System.out.println("Personas ordenadas por edad otra forma, cuando se invoca con la referencia del metodo estatico de la clase");
		Collections.sort(listaPersonas, PersonaReferencia::compararPorEdad);
		listaPersonas.forEach(p -> System.out.println(p));
		System.out.println("\n");
		
		System.out.println("Personas ordenadas invocando por metodos metodos por instancias. el primero es por nombre");
		ProveedorComparaciones pc = new ProveedorComparaciones();
		Collections.sort(listaPersonas, pc::conparadorPorNombre);
		listaPersonas.forEach(p -> System.out.println(p));
		System.out.println("\n");
		
		
		System.out.println("Personas ordenadas invocando por metodos metodos por instancias. el segundo es por edad");
		Collections.sort(listaPersonas, pc::compararPorEdad);
		listaPersonas.forEach(System.out::println);
		System.out.println("\n");		
		
		
		/*cuando uno no sabe la instancia de un obejto de utilidad podemos instanciar el metodo por referencia del objeto*/
		Collections.sort(listaPersonas,PersonaReferencia::compararPorEdad2);
		/*es lo mismo: que la expresion lambda*/
		//(p1, p2) -> p1.compararPorEdad(p2)
		
		
		
		
	}

}
