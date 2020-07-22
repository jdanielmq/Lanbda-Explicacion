package cl.curso.desarrollo.dto;

public class Persona implements Comparable<Persona>{
	
	private int idPersona;
	private String nombre;
	private java.util.Date fechaNacimiento;
	private Integer edad;
	private String correo;
	
	public Persona() {	}
	
	public Persona(int idPersona, String nombre) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
	}
	
	public Persona(String nombre, int edad, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public java.util.Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(java.util.Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
		return String.format("persona{idPersona:%1s,nombre:%2s}", idPersona, nombre);
	}

	@Override
	public int compareTo(Persona p) {
		int result = this.nombre.compareTo(p.getNombre());
		return result;
	}
	

}
