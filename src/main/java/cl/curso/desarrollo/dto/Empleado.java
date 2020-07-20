package cl.curso.desarrollo.dto;

public class Empleado {

	private int id;
	private String nombre;
	private double salario;
	private int edad;
	private String departamento;
	
	public Empleado() {
		super();
	}

	public Empleado(int id, String nombre, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public Empleado(int id, String nombre, double salario, int edad, String departamento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.edad = edad;
		this.departamento = departamento;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
