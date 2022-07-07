package supermar.code;

public class Usuario 
{
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private long dni;
	private String contrasenia;
	private Domicilio domicilio;
	
	
	
	public Usuario(String nombre, String apellido, String email, long dni, String contrasenia, Domicilio domicilio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.domicilio = domicilio;
		
	}

	public Integer getId ()
	{
		return this.id;
	}
	
	public void setId (Integer id)
	{
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return this.apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getDni() {
		return this.dni;
	}


	public void setDni(long dni) {
		this.dni = dni;
	}


	public String getContrasenia() {
		return this.contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	


}
	

