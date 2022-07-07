package supermar.repository;

public class CRUDDetail 
{
	private Conexion conn;
	private String sql;
	
	
	public CRUDDetail (Conexion conn, String sql) 
	{
		super();
		this.conn = new Conexion("supermark");
		this.conn.connect(); // open the connection
		this.sql = "";
	}
	
	
	
	
	
	
	
	
	
}
