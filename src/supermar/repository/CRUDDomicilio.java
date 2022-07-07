package supermar.repository;

import java.sql.SQLException;
import supermar.code.*;
import supermar.repository.CRUDLocalidad;


public class CRUDDomicilio 
{
	private Conexion conn;
	private String sql;
		
		
		public CRUDDomicilio()
		{
			super();
			this.conn = new Conexion("supermark");
			this.conn.connect(); // open the connection
			this.sql = "";
		}
		
		public boolean register(Domicilio dom)
		{
			CRUDLocalidad cl = new CRUDLocalidad();
			Localidad localidad = cl.getLocalidad(dom.getLocalidad().getId());
			this.sql = "INSERT INTO domicilio "+
					"(calle1,numero,depNumero,ruta,piso,id_localidad) "+
					"VALUE ('"+
					dom.getCalle()+"',"+
					dom.getNumero()+","+
					dom.getDepNumero()+",'"+
					dom.getRuta()+"',"+
					dom.getPiso()+","+
					localidad+
					")";
			boolean resultado = false;
			try
			{
				
				conn.getStmt().executeUpdate(this.sql);
				resultado = true;
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				System.out.println ("Direction registered");
			}
			return resultado;
		}
		
		/*
		public void insertarDomicilio (Domicilio dom)
		{
			
			this.sql = "INSERT INTO domicilio "+
						"(calle1,numero,ruta,km,depNumero,piso,id_localidad)"+
						"VALUE ('"+
						dom.getCalle()+"',"+
						dom.getNumero()+",'"+
						dom.getRuta()+"',"+
						dom.getKm()+","+
						dom.getDepNumero()+","+
						dom.getPiso()+","+
						1+")"; //improve this boy //getID de localidad de la base de datos, pero cual id?
			
						
						
			
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
				System.out.println ("Direction registered");
			}
		}
		*/
			
	}

