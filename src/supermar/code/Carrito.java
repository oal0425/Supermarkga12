package supermar.code;

public class Carrito 
{
	private Integer id;
	private Usuario usuario;
	private Producto producto;
	private Integer cantidad;
	
	
	public Carrito(Integer id, Usuario usuario, Producto producto, Integer cantidad) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.producto = producto;
		this.cantidad = cantidad;
	}



	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
