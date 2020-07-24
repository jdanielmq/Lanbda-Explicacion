package cl.curso.desarrollo.operaciones;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import cl.curso.desarrollo.pojo.EmpleadoSorted;

public class OperacionesSorted {

	public static void main(String[] args) {
		System.out.println("Nombres ordenados : \n");
		Arrays.asList("Ximena","Maria","Daniel", "Juan", "Alfredo")
			.stream()
			.sorted()
			.forEach(System.out::println);
		
		
		
		System.out.println("Numeros ordenados : \n");
		Arrays.asList(1,3,5,6,8,5,7,10,32,2,4,1,0)
			.stream()
			.sorted()
			.forEach(System.out::println);
		
		
		
		
		System.out.println("empleados ordeandos alfabeticamente");
		List<EmpleadoSorted> listaEmpleados = EmpleadoSorted.empleados();	
		listaEmpleados
			.stream()
			.sorted()
			.forEach(emp -> System.out.println(emp.getNombre()));
		
		
		System.out.println("empleados ordenados por años \n");
		listaEmpleados
			.stream()
			.sorted(new Comparator<EmpleadoSorted>(){
					@Override
					public int compare(EmpleadoSorted emp1, EmpleadoSorted emp2) {
						return emp1.getEdad() - emp2.getEdad();
					}
				})
			.forEach(emp -> System.out.println(emp.getNombre() +" edad: "+ emp.getEdad()));
		
		
		System.out.println("empleados ordenados por salarios \n");
		
		listaEmpleados
			.stream()
			.filter(emp -> emp.getEdad() < 25)
			.sorted(  (emp1 , emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos()))
			.forEach(emp -> System.out.println(emp.getNombre() +" ingresos: "+ emp.getIngresos()));

	}

}
