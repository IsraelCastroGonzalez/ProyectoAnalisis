package classes;

public class Transaccion {
	private String date,
				   destinationAcc,
				   destinationBank;
	
	private double amount;
	
	public Transaccion(String date, String keyIB, String destinationBank, double amount) {
		this.date = date;
		this.destinationAcc = keyIB;
		this.destinationBank = destinationBank;
		this.amount = amount;
	}
	
	public Transaccion(String date, String destinationAcc, double amount) {
		this.date = date;
		this.destinationAcc = destinationAcc;
		this.destinationBank = "Default"; // No hemos decidido el nombre de nuestro banco
		this.amount = amount;
	}
	
	
}
