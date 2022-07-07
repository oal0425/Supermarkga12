package supermar.repository;

import java.util.ArrayList;

import supermar.code.*;
import supermar.repository.*;

public class CRUDComprobante 
{
	private Conexion conn;
	private String sql;
	
	public CRUDComprobante (Conexion conn, String sql) 
	{
		super();
		this.conn = new Conexion("supermark");
		this.conn.connect(); // open the connection
		this.sql = "";
	}
	
	public boolean registrarCompra (Comprobante comprobante)
	{
		boolean result = false;
		CRUDCarrito ccarrito = new CRUDCarrito();
		ArrayList<Detail> details = ccarrito.getListado(comprobante.getDestinatario());
		comprobante.setDetails(details);
		this.sql = "INSERT INTO Comprobante "+
				   "(tipo,fecha,id_usuario,id_tc) "+
				   "VALUE ('"+
				   comprobante.getTipo()+"','"+
				   comprobante.getFecha()+"',"+
				   comprobante.getDestinatario().getId()+","+
				   comprobante.getTarjeta().getNumero()+")";
	}
	
	
	
	
	
	
	
}
