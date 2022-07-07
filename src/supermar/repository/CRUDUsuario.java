package supermar.repository;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import supermar.code.Usuario;


public class CRUDUsuario
{
	private Conexion conn;
	private String sql;
	
	
	public CRUDUsuario()
	{
		super();
		this.conn = new Conexion("supermark");
		this.conn.connect(); // open the connection
		this.sql = ""; 
				
				

	}
	
	
	public boolean registrar (Usuario usuario)
	{
		CRUDDomicilio cdom = new CRUDDomicilio();
		cdom.register(usuario.getDomicilio());
		this.sql = "INSERT INTO usuario "+
				"(nombre,apellido,email,dni,contrasenia,id_domicilio"+
				"VALUE ('"+
				usuario.getNombre()+","+
				usuario.getApellido()+"','"+
				usuario.getEmail()+"',"+
				usuario.getDni()+",'"+
				usuario.getContrasenia()+"',"+
				usuario.getDomicilio().getId()
				+")";
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
			System.out.println ("User registered");
		}
		
		return resultado;
	}
	
	
	public boolean iniciarSesion (Usuario user)
	{
		this.sql = "SELECT * FROM usuario WHERE usuario.email="+user.getEmail()+
				"' AND usuario.contrasenia = '"+user.getContrasenia()+"'";
		boolean resultado = false;
		try
		{
			conn.setRs(conn.getStmt().executeQuery(sql));
			int cantidad = 0;
			while (conn.getRs().next())
			{
				cantidad++;
			}
			if (cantidad > 0)
			{
				resultado = true;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	
	
	
	/*
	public void insertar (Usuario user)
	{
		
		this.sql = "INSERT INTO usuario "+
					"(nombre,apellido,email,dni,contrasenia,id_domicilio)"+
					"VALUE ('"+
					user.getNombre()+"','"+
					user.getApellido() + "','" +
					user.getEmail() + "'," +
					user.getDni() + ",'"+
					user.getContrasenia()+"',"+
					1+")";
		
		
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
			System.out.println ("User registered");
		}
	}
*/
		
}
	
