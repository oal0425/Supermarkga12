package supermar.repository;

import java.sql.SQLException;

import supermar.code.*;

public class CRUDProducto 
{
	private Conexion conexion;
	private String sql;
	private String table;
	
	
	public void insertarProducto (Producto product)
	{
		
		this.sql = "INSERT INTO producto"+
					this.table+
					"(nombre,marca,fecha_venc,fecha_elab,precio,stock)"+
					"VALUE (' " +
					product.getNombreProducto()+"',"+
					product.getMarcaProducto() + "'," +
					product.getfVencimiento() + "'," +
					product.getfElaboracion()+"',"+
					product.getPrecio() + "',"+
					product.getStock()+")";
		
		try
		{
			conexion.getStmt().executeUpdate(this.sql);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println ("Product registered");
		}
		
	}
}
