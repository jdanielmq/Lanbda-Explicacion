package cl.curso.desarrollo.biconsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BiConsumer {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		String[][] arreglo = {{"chris","USA"},{"Raju","India"},{"Lynda","Canada"},{"Juan Daniel","Chile"}};
		
		/*llenado de map*/
		for (int i = 0; i < arreglo.length; i++) {
			map.put(arreglo[i][0], arreglo[i][1]);
		}
		
		/*usuando metodos tradicional*/
		
		System.out.println("Usando metodos tradicionales");
		Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
		if(iter != null) {
			while (iter.hasNext()) {
				Map.Entry<String, String> entry =  iter.next();
				System.out.println("Clave:" + entry.getKey() + "\t" + "valor:"+ entry.getValue() +"\n");
			}
		}

		System.out.println("Usando metodos biConsumer y expresiones lambda. \n\n");
		
		map.forEach(
				(key, value) ->  {
					System.out.println("Clave:" + key + "\t" + "valor:"+ value +"\n");
				}
			);
		

	}

}
