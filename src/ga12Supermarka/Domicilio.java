package ga12Supermarka;

public class Domicilio
{
	private String calle;
	private Integer numero; //tambien puede ser altura
	private Integer depNumero;
	private Integer piso;
	private String manzana;
	
	
	public Domicilio(String calle, Integer numero, Integer depNumero, Integer piso, String manzana) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.depNumero = depNumero;
		this.piso = piso;
		this.manzana = manzana;
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
	public String getManzana() {
		return manzana;
	}
	public void setManzana(String manzana) {
		this.manzana = manzana;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
