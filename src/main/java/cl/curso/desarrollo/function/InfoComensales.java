package cl.curso.desarrollo.function;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import cl.curso.desarrollo.dto.DatoComensal;

public class InfoComensales {

	public static void main(String[] args) {

		List<DatoComensal> listaComensales = generaDatos();
		List<Object> listaFinal = getDatosComensales(listaComensales, x -> x.getMonto());
		for (Object object : listaFinal) {
			System.out.println(object);
		}
		
	}
	
	public static List<Object> getDatosComensales(List<DatoComensal> lista,
												Function<DatoComensal, Object> fun){
		
		List<Object> listaNueva = new ArrayList<>(0);
		for(DatoComensal dato : lista) {
			listaNueva.add(fun.apply(dato));
		}
		return listaNueva;
	}

	
	public static List<DatoComensal> generaDatos(){
		List<DatoComensal> listaComensales = new ArrayList<DatoComensal>(0);
		DatoComensal uno  = new DatoComensal("ertyuiouytre", 1, 105900);
		DatoComensal dos  = new DatoComensal("ertyuiouytre", 2, 2045);
		DatoComensal tres  = new DatoComensal("ertyuiouytre", 3, 25469);
		DatoComensal cuatro  = new DatoComensal("ertyuiouytre", 4, 587499);
		DatoComensal cinco  = new DatoComensal("ertyuiouytre", 5, 52400);
		listaComensales.add(uno);
		listaComensales.add(dos);
		listaComensales.add(tres);
		listaComensales.add(cuatro);
		listaComensales.add(cinco);
		
		return listaComensales;
		
	}

}
