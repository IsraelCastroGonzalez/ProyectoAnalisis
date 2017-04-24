package database;

import classes.*;

import java.util.Hashtable;

public class Database {
	
	//Tiene un arreglo de listas de usuarios
	private Hashtable<String, Usuario> users;
	
	private Usuario user1;
	private Usuario admin;
	private Usuario benef1;
	
	// El constructor lee del txt y guarda todos los usuarios
	// en el arreglo
	public Database() {
		// TODO Auto-generated constructor stub
		this.users = new Hashtable<>();
		
		this.benef1 = addBenef1();
		this.user1 = addUser1();
		this.admin = addUser2();
		
		this.users.put("aldopartida",this.user1);
		this.users.put("equipo2", this.admin);
		this.users.put("alumnos", this.benef1);
	}
	
	public Usuario addUser1() {
		Usuario user1 = new Usuario("0123456789", "9876543210", "purocien", "aldopartida", "aldo@hotmail.com", "TEC", "client",10000);
		// Elementos de la tarjeta
		user1.tarjeta.add(new Tarjeta("1112223334", "23/04/17", "25/02/22", 1, 1234, 1000.00));
		user1.tarjeta.add(new Tarjeta("4445556667", "06/09/15", "09/08/20", 2, 4321, 666.66));

		user1.transaction.add(new Transaccion("20/04/16", "9876543210", "Santander", 550.80));
		user1.transaction.add(new Transaccion("29/08/16", "9876543210", "Banorte", 990.20));

		//user1.beneficiaries.add(this.benef1);

		user1.services.add(new Servicio("CFE", "01/06/17", "6730132801", "Bancomer", 667.70));
		user1.services.add(new Servicio("Agua", "01/05/17", "1430926702", "Banamex", 550.34));

		user1.notifications.add(new Notificacion("1112223334", "Pago CFE realizada con exito", 
				new Transaccion("23/04/17", "1425364778", 100000.0)));
		user1.notifications.add(new Notificacion("4445556667", "Pago del agua realizada con exito",
				new Transaccion("17/04/17", "1425364778", 1000.0)));
		return user1;
	}
	
	public Usuario addUser2(){
		Usuario user2 = new Usuario("", "", "cien", "equipo2", "", "", "admin",0);
		return user2;
	}

	public Usuario addBenef1(){
		Usuario benef1 = new Usuario("1111111111", "2222222222", "alum", "alumnos", "alumnos@hotmail.com", "TEC", "client",10);
		// Elementos de la tarjeta
		benef1.tarjeta.add(new Tarjeta("1112223335", "23/04/17", "25/02/22", 1, 1244, 1000.00));
		benef1.tarjeta.add(new Tarjeta("4445556666", "06/09/15", "09/08/20", 2, 4361, 666.66));

		benef1.transaction.add(new Transaccion("20/04/16", "9876543210", "Santander", 550.80));
		benef1.transaction.add(new Transaccion("29/08/16", "9876543210", "Banorte", 990.20));

		benef1.services.add(new Servicio("CFE", "01/06/17", "6730132801", "Bancomer", 667.70));
		benef1.services.add(new Servicio("Agua", "01/05/17", "1430926702", "Banamex", 550.34));

		benef1.notifications.add(new Notificacion("1112223334", "Pago CFE realizada con exito", 
				new Transaccion("23/04/17", "1425364778", 100000.0)));
		benef1.notifications.add(new Notificacion("4445556667", "Pago del agua realizada con exito",
				new Transaccion("17/04/17", "1425364778", 1000.0)));
		return benef1;
	}
	
	public void addUser(Usuario user) {
		this.users.put(user.getName(), user);
	}

	public void addBenef(String client, String benef){
		System.out.println(benef);
		System.out.println(this.benef1.getName());
		if (this.benef1.getName().equalsIgnoreCase(benef)) {
			System.out.println("wee");
			this.users.get(client).beneficiaries.add(this.benef1);
		}
	}
	public Hashtable<String, Usuario> getUsers() {
		return users;
	}

	public void setUsers(Hashtable<String, Usuario> users) {
		this.users = users;
	}

	
	// Tiene una función hash que regresa siempre la misma posicion
	// en el arrego

	// Tiene una funcion que busca y regresa la informacion de un usuario

	// tiene un metodo que añade usuarios

}
