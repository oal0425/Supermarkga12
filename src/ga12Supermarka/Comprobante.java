package ga12Supermarka;

import java.util.ArrayList;
import java.sql.*;

public class Comprobante 
{
	private Integer idComprobante;
	private float total;
	private Date fecha;
	private Character tipo;
	private ArrayList <Producto> productos;
	
	
	public Comprobante(Integer idComprobante, float total, Date fecha, Character tipo, ArrayList<Producto> productos) {
		super();
		this.idComprobante = idComprobante;
		this.total = total;
		this.fecha = fecha;
		this.tipo = tipo;
		this.productos = productos;
	}


	public Integer getIdComprobante() {
		return idComprobante;
	}


	public void setIdComprobante(Integer idComprobante) {
		this.idComprobante = idComprobante;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Character getTipo() {
		return tipo;
	}


	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}


	public ArrayList<Producto> getProductos() {
		return productos;
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
