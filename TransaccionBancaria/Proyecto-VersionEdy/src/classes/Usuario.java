package classes;
import java.util.LinkedList;

public class Usuario {
	private String accountNo,
				   keyIB,
				   password,
				   name,
				   email,
				   address,
				   accountType;
	private int balance;
	public LinkedList<Tarjeta> tarjeta;
	public LinkedList<Transaccion> transaction;
	public LinkedList<Usuario> beneficiaries;
	public LinkedList<Servicio> services;
	public LinkedList<Notificacion> notifications;
	
	public Usuario(String accountNo, String keyIB, String password, String name,
				   String email, String address, String accountType, int balance) {
		this.accountNo = accountNo;
		this.keyIB = keyIB;
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
		this.accountType = accountType;
		this.balance = balance;

		// Inicializar arreglos
		this.tarjeta = new LinkedList<>();
		this.transaction = new LinkedList<>();
		this.beneficiaries = new LinkedList<>();
		this.services = new LinkedList<>();
		this.notifications = new LinkedList<>();
	}
	
	public void addBeneficiaries(Tarjeta tarjeta, Usuario usuario, double climit) {
		
	}
	
	public void addTarjeta(Tarjeta tarjeta){
		this.tarjeta.add(tarjeta);
	}
	
	public LinkedList<Transaccion> getTrans() {
		return this.transaction;
	}
	
	public void sendReport() {
		
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getKeyIB() {
		return keyIB;
	}

	public void setKeyIB(String keyIB) {
		this.keyIB = keyIB;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public LinkedList<Usuario> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(LinkedList<Usuario> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
	
	
}
