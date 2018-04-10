package account;

public class historia {
	private typOperacji type;
	private String fromAccountNumber;
	private String toAccountNumber;
	private double amount;
	
	
	public historia(typOperacji type, String fromAccountNumber,
			String toAccountNumber, double amount) {
		super();
		this.type = type;
		this.fromAccountNumber = fromAccountNumber;
		this.toAccountNumber = toAccountNumber;
		this.amount = amount;
	}
	
	
	public typOperacji getType() {
		return type;
	}
	public void setType(typOperacji type) {
		this.type = type;
	}
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "historia [type=" + type + ", fromAccountNumber="
				+ fromAccountNumber + ", toAccountNumber=" + toAccountNumber
				+ ", amount=" + amount + "]";
	}
	
	
}
