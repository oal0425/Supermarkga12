package supermar.repository;

import java.sql.SQLException;

import supermar.code.*;

public class CRUDCarrito 
{
	private Conexion conn;
	private String sql;
	
	
	
	
	public CRUDCarrito() {
		super();
	}

	public CRUDCarrito(Conexion conn, String sql) 
	{
		super();
		this.conn = new Conexion("supermark");
		this.conn.connect(); // open the connection
		this.sql = "";
	}
	
	public boolean insertar (Carrito carrito)
	{
		this.sql = "INSERT INTO Carrito " +
				   "(id_usuario,id_producto,cantidad) "+
				   "VALUE ("+
				   carrito.getUsuario().getId()+","+
				   carrito.getProducto().getIdProducto()+","+
				   carrito.getCantidad()+")";
		boolean result = false;
		try
		{
			
			int rows = conn.getStmt().executeUpdate(this.sql);
			if (rows > 0)
			{
				result = true;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println ("Products ADDED");
		}
		
		return result;
	}
	
	public getListado ()
	{
		
	}
	
	
	
	
}
