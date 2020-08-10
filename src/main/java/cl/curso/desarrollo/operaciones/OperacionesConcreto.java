package cl.curso.desarrollo.operaciones;

import java.util.List;
import java.util.stream.IntStream;

import cl.curso.desarrollo.pojo.EmpleadoSorted;

public class OperacionesConcreto {

	public static void main(String[] args) {
		
		int[] numeros = {1,4,8,5,1,2,3,5,9,21,45,11,3,3,8,10,80,70,85,99,45,33,45,66}; 
		List<EmpleadoSorted> listaEmpleadoSorteds = EmpleadoSorted.empleados();
		
		
		System.out.println("suma :"+ IntStream.of(numeros).sum());
		
		System.out.println("promedio: "+ IntStream.of(numeros).average().getAsDouble());
		
		System.out.println("valor maximo: "+ IntStream.of(numeros).max().getAsInt());

		System.out.println("valor maximo: "+ IntStream.of(numeros).max().getAsInt());
		
		System.out.println("valor minimo: "+ IntStream.of(numeros).min().getAsInt());

		System.out.println("cantidad: "+ IntStream.of(numeros).count());
		
		System.out.println("Operaciones con empleados de streams ");
		
		System.out.println("cantidad: "+ 
				listaEmpleadoSorteds
				.stream()
				.mapToDouble(EmpleadoSorted::getIngresos)
				.sum()
		);
		
		EmpleadoSorted empleadoMaximo = listaEmpleadoSorteds
											.stream()
											.max((emp1,emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos()))
											.get();
		
		
		System.out.println("El empleado seleccioando :" + empleadoMaximo.getNombre() + " salario:"+ empleadoMaximo.getIngresos());
		
		
		
	}

}
