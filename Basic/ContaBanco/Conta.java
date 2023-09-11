package Basic.ContaBanco;

public class Conta {

	private int number;
	private String agency;
	private String clientName;
	private double balance;
	
	public Conta() {
	}

	public Conta(int number, String agency, String clientName, double balance) {
		super();
		this.number = number;
		this.agency = agency;
		this.clientName = clientName;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
