package cl.curso.desarrollo.dto;

public class PersonaReferencia {
	private String nombre;
	private Integer edad;
	private String correo;
	
	public PersonaReferencia() {	}
	

	public PersonaReferencia(String nombre, int edad, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "nombre="+nombre + ", edad="+ edad;
	}

	public int compararPorEdad2(PersonaReferencia p1) {
		return this.getEdad().compareTo(p1.getEdad());
	}
	
	public static int compararPorEdad(PersonaReferencia p1, PersonaReferencia p2) {
		return p1.getEdad().compareTo(p2.getEdad());
	}
	
	
	
}



