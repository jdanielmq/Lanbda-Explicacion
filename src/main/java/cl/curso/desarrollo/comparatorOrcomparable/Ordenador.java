package cl.curso.desarrollo.comparatorOrcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cl.curso.desarrollo.dto.Persona;

public class Ordenador {

	public static void main(String[] args) {

		List<String> listaNombres = Arrays.asList("Juan","Daniel","Francisco","Oscar","Ana","German");
		
		System.out.println("lista de nombres : "+ listaNombres);
		
		Collections.sort(listaNombres);
		
		System.out.println("lista de nombres : "+ listaNombres);
		
		List<Persona> listaPersonas = Arrays.asList(new Persona(2,"Mario"),
													new Persona(3,"Fernando"),
													new Persona(4,"Ana"),
													new Persona(1,"Juana"));
		
		System.out.println("lista sin ordenar: \n"+ listaPersonas);
		
		Collections.sort(listaPersonas);
		
		System.out.println("lista ordenado por nombre: \n"+ listaPersonas);
		
		Collections.sort(listaPersonas, new OrdenarPersonaPorId());
		
		System.out.println("lista ordeando por id : \n" + listaPersonas);
		
		Collections.sort(listaPersonas);
		
		System.out.println("lista ordenado por nombre: \n"+ listaPersonas);
	
		/*ordeamiento con la interfaz Comparator con una clase anonima en el mismo sort*/
		Collections.sort(listaPersonas, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getIdPersona() - o2.getIdPersona();
			}
		});
		System.out.println("lista ordenado por id y con una metodo anonimo: \n"+ listaPersonas);
		
		
		Collections.sort(listaPersonas);
		System.out.println("lista ordenado por nombre: \n"+ listaPersonas);
		
		
		/*Collections.sort -> con expresiones lambda */
		Collections.sort(listaPersonas, (p1,p2) -> p1.getIdPersona() - p2.getIdPersona());
		System.out.println("lista ordenado por id y con una expresion lambda: \n"+ listaPersonas);
		
		
		
		

	}

}
