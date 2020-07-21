package cl.curso.desarrollo.comparatorOrcomparable;

import java.util.Comparator;

import cl.curso.desarrollo.dto.Persona;

public class OrdenarPersonaPorId implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getIdPersona() - o2.getIdPersona();
	}

}
