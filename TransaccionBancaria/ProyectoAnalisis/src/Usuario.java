import java.util.LinkedList;

public class Usuario {
	private String accountNo,
				   keyIB,
				   password,
				   name,
				   email,
				   address,
				   accountType;
	private LinkedList<Tarjeta> tarjeta;
	private LinkedList<Transaccion> transaction;
	private LinkedList<Usuario> beneficiaries;
	private LinkedList<Servicio> services;
	private LinkedList<Notificacion> notifications;
	
	public Usuario(String accountNo, String keyIB, String password, String name,
				   String email, String address, String accountType) {
		this.accountNo = accountNo;
		this.keyIB = keyIB;
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
		this.accountType = accountType;

		// Inicializar arreglos
		this.tarjeta = new LinkedList<>();
		this.transaction = new LinkedList<>();
		this.beneficiaries = new LinkedList<>();
		this.services = new LinkedList<>();
		this.notifications = new LinkedList<>();
	}
	
	public void addBeneficiaries(Tarjeta tarjeta, Usuario usuario, double climit) {
		
	}
	
	public LinkedList<Transaccion> getTrans() {
		return this.transaction;
	}
	
	public void sendReport() {
		
	}
}
