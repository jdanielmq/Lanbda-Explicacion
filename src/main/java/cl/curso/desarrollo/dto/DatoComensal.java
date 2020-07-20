package cl.curso.desarrollo.dto;

public class DatoComensal {
	
	private String id;
	private int mesa;
	private long monto;
	
	
	public DatoComensal(String id, int mesa, long monto) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.monto = monto;
	}


	public DatoComensal() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getMesa() {
		return mesa;
	}


	public void setMesa(int mesa) {
		this.mesa = mesa;
	}


	public long getMonto() {
		return monto;
	}


	public void setMonto(long monto) {
		this.monto = monto;
	}
	
	
	

}
