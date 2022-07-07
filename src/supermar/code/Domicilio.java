package supermar.code;

public class Domicilio
{
	private Integer id;
	private String calle;
	private Integer numero; //tambien puede ser altura
	private String ruta;
	private Integer km;
	private Integer depNumero;
	private Integer piso;
	private Localidad localidad;
	
	
	public Domicilio (Integer id)
	{
		super();
		this.id = id;
	}
	
	public Domicilio(Integer id, String calle, Integer numero, String ruta, Integer km, Integer depNumero, Integer piso, Localidad localidad) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.ruta = ruta;
		this.km = km;
		this.depNumero = depNumero;
		this.piso = piso;
		this.localidad = localidad;
	}

	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getRuta() {
		return ruta;
	}


	public void setRuta(String ruta) {
		this.ruta = ruta;
	}


	public Integer getKm() {
		return km;
	}


	public void setKm(Integer km) {
		this.km = km;
	}


	public Integer getDepNumero() {
		return depNumero;
	}


	public void setDepNumero(Integer depNumero) {
		this.depNumero = depNumero;
	}


	public Integer getPiso() {
		return piso;
	}


	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	
	
	
	
	
	
	
}
