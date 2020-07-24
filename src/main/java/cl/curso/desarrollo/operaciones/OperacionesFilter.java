package cl.curso.desarrollo.operaciones;

import java.util.List;
import java.util.function.Predicate;

import cl.curso.desarrollo.pojo.Empleado;

public class OperacionesFilter {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = Empleado.empleados();
		
		System.out.println("Empleados Hombres: ");
		listaEmpleados.stream()
		              .filter(new Predicate<Empleado> () {
		            	  @Override
		            	  public boolean test(Empleado emp) {
		            		  return emp.esHombre();
		            	  }
		              })
		              .forEach(emp -> System.out.println("Nombre: "+ emp.getNombre() + " " + emp.getGenero()));
		
		
		
					  
		System.out.println("Empleados Mujeres: \n");
		listaEmpleados
			.stream()
			.filter(Empleado::esMujer)
			.forEach(emp -> System.out.println("Nombre: "+ emp.getNombre() + " " + emp.getGenero()));
		
		
		
		System.out.println("Empleados mayores de 25 años: \n");
		listaEmpleados
			.stream()
			.filter(emp -> emp.getEdad() > 25)
			.forEach(emp -> System.out.println("Nombre: "+ emp.getNombre() + " " + emp.getEdad()));
		
		
		System.out.println("Empleados masculino y mayores de 25 años : \n");
		listaEmpleados
			.stream()
			.filter(Empleado::esHombre)
			.filter(emp -> emp.getEdad() > 25)
			.filter(emp -> emp.getNombre().startsWith("a"))
			.forEach(emp -> System.out.println("Nombre: "+ emp.getNombre() + " " + emp.getEdad()));
		
		
		
		System.out.println("Empleados femenino que gana mas de 500.000 : \n");
		listaEmpleados
			.stream()
			.filter(emp -> emp.esMujer() && emp.getIngresos() > 500000 )
			.forEach(emp -> System.out.println("Nombre: "+ emp.getNombre() + " " + emp.getIngresos()));
		
		
		System.out.println("\n Empleados femenino de 25 años que gana mas de 500.000 : \n");
		Predicate<Empleado> empFemenino = emp -> emp.esMujer();
		Predicate<Empleado> empMayor25 = emp -> emp.getEdad() > 25;
		Predicate<Empleado> empMayor500 = emp -> emp.getIngresos() > 500000;
		Predicate<Empleado> predicateFinal = empFemenino.and(empMayor25).and(empMayor500);
		
		
		listaEmpleados
			.stream()
			.filter(predicateFinal)
			.forEach(emp -> System.out.println("Nombre: "+ emp.getNombre() + " " + emp.getIngresos()));
			
		System.out.println("cantidad : " + listaEmpleados.stream().filter(predicateFinal).count());
		
		
		
		
		
		
		
	}

}
