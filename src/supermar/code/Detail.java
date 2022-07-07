package supermar.code;

public class Detail 
{
	private Integer id;
	private Producto producto;
	private Integer cantidad;
	
	
	public Detail(Producto producto, Integer cantidad) 
	{
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
