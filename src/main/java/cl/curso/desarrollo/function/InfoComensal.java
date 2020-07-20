package cl.curso.desarrollo.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import cl.curso.desarrollo.dto.DatoComensal;

public class InfoComensal {

	public static void main(String[] args) {
		
		DatoComensal info = generaDatos().get(0);
		Object obj = getDatoComensal(info, x -> x.getMonto());
		System.out.println(obj);

	}
	
	
	public static Object getDatoComensal(DatoComensal comensal, 
										Function<DatoComensal, Object> fun) {
		return fun.apply(comensal);
		
	}
	
	public static List<DatoComensal> generaDatos(){
		List<DatoComensal> listaComensales = new ArrayList<DatoComensal>(0);
		DatoComensal uno  = new DatoComensal("ertyuiouytre", 1, 105900);
		DatoComensal dos  = new DatoComensal("ertyudsfsdiouytre", 2, 2045);
		DatoComensal tres  = new DatoComensal("ertyuiodsfuytre", 3, 25469);
		DatoComensal cuatro  = new DatoComensal("dsfdfsd", 4, 587499);
		DatoComensal cinco  = new DatoComensal("ertyuiodsfsduytre", 5, 52400);
		listaComensales.add(uno);
		listaComensales.add(dos);
		listaComensales.add(tres);
		listaComensales.add(cuatro);
		listaComensales.add(cinco);
		
		return listaComensales;
		
	}

}
