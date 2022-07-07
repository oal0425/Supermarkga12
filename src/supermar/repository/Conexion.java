package supermar.repository;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion 
{
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost:4025/";
	//Credenciales de la BDD
	static final String USER = "root";
	static final String PASS = "M3t@l0425";
	
	//28 CLASS TO SEE MORE INFORMATION
	
	Connection conn = null;
	Statement stmt = null;//Objeto para realizar las declaraciones SQL que requiramos
	ResultSet rs = null;//Conjunto de resultados
	
	public Conexion (String db)
	{
		this.DB_URL += db;
	}
	
	public void connect ()
	{
		try 
		{
			Class.forName(JDBC_DRIVER); // Instanciamos el driver make you sure you can breath it amazing
			
			System.out.println("Conectando a la base datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);//Me conecto a la base datos
			
			System.out.println("Creando sentencias SQL...");
			stmt = conn.createStatement();	//Especificamos que crearemos una sentencia SQL sobre la conexion previamente creada
			//String sql = "SELECT persona.id,persona.nombre,persona.apellido1,persona.fecha_nacimiento,persona.sexo FROM universidad.persona";
			//rs = stmt.executeQuery();//Ejecuto la consulta SELECT
			//String sql2 = "INSERT INTO universidad.departamento (departamento.nombre) VALUE ('Nutrición')";
			//stmt.executeUpdate(sql2);
			
	
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void close ()
	{
		try 
		{
			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
		
		
		

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

}