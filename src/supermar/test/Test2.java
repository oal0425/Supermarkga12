package supermar.test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {
	
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:4025/supermark";
	//Credenciales de la BDD
	static final String USER = "root";
	static final String PASS = "M3t@l0425";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;//Objeto para realizar las declaraciones SQL que requiramos
		ResultSet rs = null;//Conjunto de resultados
		
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Conectando a la base datos...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);//Me conecto a la base datos
			
			System.out.println("Creando sentencias SQL...");
			stmt = conn.createStatement();//Especificamos que crearemos una sentencia SQL sobre la conexion previamente creada
			//String sql = "INSERT INTO usuario.nombre (usuario.nombre) VALUE ('Chacha')";
			//rs = stmt.executeQuery(sql);//Ejecuto la consulta SELECT
			 
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//rs.close();
				stmt.close();
				conn.close();
				System.out.println ("eso tilin");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}