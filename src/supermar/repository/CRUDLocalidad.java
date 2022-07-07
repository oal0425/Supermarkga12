package supermar.repository;

import java.sql.SQLException;


import supermar.code.Domicilio;
import supermar.code.*;

public class CRUDLocalidad 
{
	private Conexion conn;
	private String sql;
		
		
		public CRUDLocalidad()
		{
			super();
			this.conn = new Conexion("supermark");
			this.conn.connect(); // open the connection
			this.sql = "";
		}
		
		public Localidad getLocalidad (Integer id)
		{
			this.sql = "SELECT * FROM localidad "+
					"WHERE localidad.id="+id;
			Localidad localidad = null;
			try
			{
				conn.setRs(conn.getStmt().executeQuery(sql));
				localidad = new Localidad(
						id
						);
						
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
			return localidad;
		}
		
		
		
		public void insertarLocalidad (Localidad loc)
		{
			
			this.sql = "INSERT INTO localidad "+
						"(provincia,departamento,ciudad)"+
						"VALUE ('"+
						loc.getProvincia()+"','"+
						loc.getDepartamento()+"','"+
						loc.getCiudad()+"')";
						
			
			try
			{
				
				conn.getStmt().executeUpdate(this.sql);
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println ("Locality registered");
			}
		}
}
