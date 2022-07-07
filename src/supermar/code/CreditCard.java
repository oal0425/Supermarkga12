package supermar.code;

public class CreditCard 
{
	private Integer numero;
	private Usuario usuario;
	private String banco;
	protected double balance;
	private double limite;
	
	public CreditCard(Integer numero) 
	{
		super();
		this.numero = numero;
	}

	public CreditCard(Integer numero, Usuario usuario, String banco, double balance, double limite) {
		super();
		this.numero = numero;
		this.usuario = usuario;
		this.banco = banco;
		this.balance = balance;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
}
