package modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Prestamo_modelo extends Conector{
	
	Prestamo_modelo(String dbIzena) {
		super(dbIzena);
		// TODO Auto-generated constructor stub
	}

	public ArrayList <Prestamo> select(){
		ArrayList <Prestamo> prestamos = new ArrayList<Prestamo>();
		try{
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from prestamos");
			while (rs.next()){
				prestamos.add(new Prestamo(rs.getInt("id_libro"), rs.getInt("id_socio"), rs.getDate("fecha"), rs.getBoolean("devuelto")));
				
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return prestamos;
	}
	
	public Prestamo select(int id_libro, int id_socio, Date fecha){
		try{
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from prestamos where id=" + id_libro);
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return null;
		
		
	}
}