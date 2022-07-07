package supermar.code;


import java.sql.Date;

public class Producto
{
	private Integer idProducto;
	private String nombreProducto;
	private String marcaProducto;
	private Date fVencimiento;
	private Date fElaboracion;
	private Double precio;
	private Integer stock;
	
	
	
	


	public Producto(Integer idProducto, String nombreProducto, String marcaProducto, Date fVencimiento,
			Date fElaboracion, Double precio, Integer stock) 
	{
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.marcaProducto = marcaProducto;
		this.fVencimiento = fVencimiento;
		this.fElaboracion = fElaboracion;
		this.precio = precio;
		this.stock = stock;
	}


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public String getMarcaProducto() {
		return marcaProducto;
	}


	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}


	public Date getfVencimiento() {
		return fVencimiento;
	}


	public void setfVencimiento(Date fVencimiento) {
		this.fVencimiento = fVencimiento;
	}


	public Date getfElaboracion() {
		return fElaboracion;
	}


	public void setfElaboracion(Date fElaboracion) {
		this.fElaboracion = fElaboracion;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}