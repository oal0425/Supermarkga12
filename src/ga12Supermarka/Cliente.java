package ga12Supermarka;

public class Cliente 
{
	
	private Integer idCliente;
	private String dni;
	private Domicilio domicilio;
	private String email;	
	
	
	public Cliente(Integer idCliente, String dni, Domicilio domicilio, String email) 
	{
		super();
		this.idCliente = idCliente;
		this.dni = dni;
		this.domicilio = domicilio;
		this.email = email;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Domicilio getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

