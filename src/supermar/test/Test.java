package supermar.test;

import supermar.repository.*;
import supermar.code.*;

public class Test {

	public static void main(String[] args) 
	{
		CRUDUsuario micrud = new CRUDUsuario();
		CRUDLocalidad lor1 = new CRUDLocalidad();
		CRUDDomicilio dom1 = new CRUDDomicilio();
		//Domicilio dom = new Domicilio("Cucuy",520,0,0,"");
		Usuario user1 = new Usuario ("Homero","Thompsono","homerthompson@gmail.com",26052033,"rosquilla");
		Localidad loc1 = new Localidad ("Salta","Cerrillos","La Merced");
		Domicilio domicilio = new Domicilio ("cucuy",520,"",0,0,0);
		
		//lor1.insertarLocalidad(loc1);
		//dom1.insertarDomicilio(domicilio);
		micrud.insertar(user1);

	}

}
