package cl.curso.desarrollo.utilerias;

import cl.curso.desarrollo.dto.PersonaReferencia;

public class ProveedorComparaciones {
	
	public int conparadorPorNombre(PersonaReferencia p1, PersonaReferencia p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	}
	
	public int compararPorEdad(PersonaReferencia p1, PersonaReferencia p2) {
		return p1.getEdad().compareTo(p2.getEdad());
	}

}
