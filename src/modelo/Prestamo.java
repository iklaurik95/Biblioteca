package modelo;

import java.util.Date;

public class Prestamo {
	private int id_socio;
	private int id_libro;
	private Date fecha;
	private boolean devuelto;
	
	public Prestamo(int id_socio, int id_libro, Date fecha, boolean devuelto) {
		super();
		this.id_socio = id_socio;
		this.id_libro = id_libro;
		this.fecha = fecha;
		this.devuelto = devuelto;
	}

	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isDevuelto() {
		return devuelto;
	}

	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	
	public void mostrarInfo(){
		
	}
	
	
}
