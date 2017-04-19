
public class Notificacion {

	private String accountNo, 
				   message;
	
	private Transaccion transaction;
	
	public Notificacion(String accountNo, String message, Transaccion transaction) {
		this.accountNo = accountNo;
		this.message = message;
		this.transaction = transaction;
	}
}
