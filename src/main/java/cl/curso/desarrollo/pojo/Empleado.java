package cl.curso.desarrollo.pojo;

import java.util.Arrays;
import java.util.List;

public class Empleado {
	
	private long id;
	private String nombre;
	private double ingresos;
	private Genero genero;
	private int edad;
	
	public Empleado(long id, String nombre, double ingresos, Genero genero, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ingresos = ingresos;
		this.genero = genero;
		this.edad = edad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static enum Genero {
		HOMBRE,MUJER
	}
	
	public boolean esHombre() {
		return this.genero == Genero.HOMBRE;
	}
	
	public boolean esMujer() {
		return this.genero == Genero.MUJER;
	}
	
	public static List<Empleado> empleados(){
		Empleado emp1 = new Empleado(1, "Juan Daniel", 100000, Genero.HOMBRE, 39);
		Empleado emp2 = new Empleado(2, "mauricio", 245813, Genero.HOMBRE, 20);
		Empleado emp3 = new Empleado(3, "pedro", 350485, Genero.HOMBRE, 35);
		Empleado emp4 = new Empleado(4, "daniela", 569742, Genero.MUJER, 21);
		Empleado emp5 = new Empleado(5, "leonel", 536984, Genero.HOMBRE, 33);
		Empleado emp6 = new Empleado(6, "adrian", 533266, Genero.HOMBRE, 26);
		Empleado emp7 = new Empleado(7, "maria", 921522, Genero.MUJER, 30);
		Empleado emp8 = new Empleado(8, "julieta", 759652, Genero.MUJER, 31);
		Empleado emp9 = new Empleado(9, "jose", 584211, Genero.HOMBRE, 25);
		Empleado emp10 = new Empleado(10, "rodrigo", 254692, Genero.HOMBRE, 22);
		Empleado emp11 = new Empleado(11, "francisco", 658741, Genero.HOMBRE, 28);
		Empleado emp12 = new Empleado(12, "maria jose", 254855, Genero.MUJER, 24);
		Empleado emp13 = new Empleado(13, "esteban", 569874, Genero.HOMBRE, 35);
		Empleado emp14 = new Empleado(14, "cote", 625415, Genero.MUJER, 33);
		Empleado emp15 = new Empleado(15, "ignacio", 53644, Genero.HOMBRE, 27);
		Empleado emp16 = new Empleado(16, "Daniel", 56422, Genero.HOMBRE, 20);
		Empleado emp17 = new Empleado(17, "isabel", 635241, Genero.MUJER, 19);
		Empleado emp18 = new Empleado(18, "Patricia", 654789, Genero.MUJER, 23);
		Empleado emp19 = new Empleado(19, "rogelio", 635245, Genero.HOMBRE, 22);
		Empleado emp20 = new Empleado(20, "pedro", 547852, Genero.HOMBRE, 28);
		Empleado emp21 = new Empleado(21, "rodrigo", 568740, Genero.HOMBRE, 24);
		Empleado emp22 = new Empleado(22, "constanza", 569874, Genero.MUJER, 37);
		
		
		
		return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10,emp11,emp12,emp13,emp14,emp15,emp16,emp17,emp18,emp19,emp20,emp21,emp22);
	}

}
