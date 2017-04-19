
public class Tarjeta {

	private String accountNo,
				   expDate,
				   cadDate;
	
	private int noTarjeta,
			    securityCode;
	
	private double cLimit;
	
	public Tarjeta(String accountNo, String expDate, String cadDate, int noTarjeta, 
					int securityCode, double cLimit) {
		this.accountNo = accountNo;
		this.expDate = expDate;
		this.cadDate = cadDate;
		this.noTarjeta = noTarjeta;
		this.securityCode = securityCode;
		this.cLimit = cLimit;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCadDate() {
		return cadDate;
	}

	public void setCadDate(String cadDate) {
		this.cadDate = cadDate;
	}

	public int getNoTarjeta() {
		return noTarjeta;
	}

	public void setNoTarjeta(int noTarjeta) {
		this.noTarjeta = noTarjeta;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public double getcLimit() {
		return cLimit;
	}

	public void setcLimit(double cLimit) {
		this.cLimit = cLimit;
	}
	
	
}
