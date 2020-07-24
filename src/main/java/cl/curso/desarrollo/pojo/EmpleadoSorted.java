package cl.curso.desarrollo.pojo;

import java.util.Arrays;
import java.util.List;

public class EmpleadoSorted implements Comparable{
	
	private long id;
	private String nombre;
	private double ingresos;
	private Genero genero;
	private int edad;
	
	public EmpleadoSorted(long id, String nombre, double ingresos, Genero genero, int edad) {
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
	
	public static List<EmpleadoSorted> empleados(){
		EmpleadoSorted emp1 = new EmpleadoSorted(1, "Juan Daniel", 100000, Genero.HOMBRE, 39);
		EmpleadoSorted emp2 = new EmpleadoSorted(2, "mauricio", 245813, Genero.HOMBRE, 20);
		EmpleadoSorted emp3 = new EmpleadoSorted(3, "pedro", 350485, Genero.HOMBRE, 35);
		EmpleadoSorted emp4 = new EmpleadoSorted(4, "daniela", 569742, Genero.MUJER, 21);
		EmpleadoSorted emp5 = new EmpleadoSorted(5, "leonel", 536984, Genero.HOMBRE, 33);
		EmpleadoSorted emp6 = new EmpleadoSorted(6, "adrian", 533266, Genero.HOMBRE, 26);
		EmpleadoSorted emp7 = new EmpleadoSorted(7, "maria", 921522, Genero.MUJER, 30);
		EmpleadoSorted emp8 = new EmpleadoSorted(8, "julieta", 759652, Genero.MUJER, 31);
		EmpleadoSorted emp9 = new EmpleadoSorted(9, "jose", 584211, Genero.HOMBRE, 25);
		EmpleadoSorted emp10 = new EmpleadoSorted(10, "rodrigo", 254692, Genero.HOMBRE, 22);
		EmpleadoSorted emp11 = new EmpleadoSorted(11, "francisco", 658741, Genero.HOMBRE, 28);
		EmpleadoSorted emp12 = new EmpleadoSorted(12, "maria jose", 254855, Genero.MUJER, 24);
		EmpleadoSorted emp13 = new EmpleadoSorted(13, "esteban", 569874, Genero.HOMBRE, 35);
		EmpleadoSorted emp14 = new EmpleadoSorted(14, "cote", 625415, Genero.MUJER, 33);
		EmpleadoSorted emp15 = new EmpleadoSorted(15, "ignacio", 53644, Genero.HOMBRE, 27);
		EmpleadoSorted emp16 = new EmpleadoSorted(16, "Daniel", 56422, Genero.HOMBRE, 20);
		EmpleadoSorted emp17 = new EmpleadoSorted(17, "isabel", 635241, Genero.MUJER, 19);
		EmpleadoSorted emp18 = new EmpleadoSorted(18, "Patricia", 654789, Genero.MUJER, 23);
		EmpleadoSorted emp19 = new EmpleadoSorted(19, "rogelio", 635245, Genero.HOMBRE, 22);
		EmpleadoSorted emp20 = new EmpleadoSorted(20, "pedro", 547852, Genero.HOMBRE, 28);
		EmpleadoSorted emp21 = new EmpleadoSorted(21, "rodrigo", 568740, Genero.HOMBRE, 24);
		EmpleadoSorted emp22 = new EmpleadoSorted(22, "constanza", 569874, Genero.MUJER, 37);
		
		
		
		return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10,emp11,emp12,emp13,emp14,emp15,emp16,emp17,emp18,emp19,emp20,emp21,emp22);
	}

	@Override
	public int compareTo(Object o) {
		return this.getNombre().compareTo(((EmpleadoSorted)o).getNombre());
	}

}
