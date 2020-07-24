package cl.curso.desarrollo.operaciones;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

import cl.curso.desarrollo.pojo.Empleado;

public class OperacionMap {

	public static void main(String[] args) {
		
		IntStream
			.rangeClosed(1, 5)
			.map(new IntUnaryOperator() {
				@Override
				public int applyAsInt(int num) {
					return num * num;
				}
			})
			.forEach(System.out::println);
		
		
		System.out.println("\n");
		IntStream
			.rangeClosed(1, 10)
			.map(num -> num * 2)
			.forEach(System.out::println);
		
		
		
		
		
		System.out.println("Promedio de ingreso del personal femenino mayor de 25 años");
		
		List<Empleado> listaEmpleados = Empleado.empleados();
		
		double suma = listaEmpleados
						.stream()
						.filter(emp -> emp.esMujer())
						.filter(emp -> emp.getEdad() > 25)
						.mapToDouble(emp -> emp.getIngresos())
						.sum();
		
		double cantidad = listaEmpleados
				 .stream()
				 .filter(emp -> emp.esMujer())
				 .filter(emp -> emp.getEdad( )> 25)
				 .count();
		
		
		
		double promedio = suma / cantidad;
		
		
		System.out.println("suma : "+ suma +" cantiadad de empleado: "+ cantidad );
		System.out.println("el promedio es "+ promedio);
		

	}

}
