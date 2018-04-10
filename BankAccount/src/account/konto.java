package account;

import java.util.ArrayList;
import java.util.List;

public class konto {
	private String number;
	private double balance;
	private List<historia> history = new ArrayList<>();

	public konto(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(double amount){
		if(this.balance >= amount){
			this.balance -= amount;
			history.add(new historia(typOperacji.KREDYT, "GOTÓWKA", number, amount));
			return true;
		}
		else {
			System.out.println("Zbyt mało środków na koncie! #bjedak");
			return false;
		}
	}
	public void income(double amount){
		this.balance += amount;
		history.add(new historia(typOperacji.KREDYT, "GOTÓWKA", number, amount));
	}
	
	public void transfer(konto account, double amount){
		if (this.withdraw(amount) == true){
			this.history.add(new historia(typOperacji.DEBET, this.number, account.getNumber(), amount));
			account.getHistory().add(new historia(typOperacji.KREDYT, this.number, account.getNumber(), amount));
			account.income(amount);
		}
	}
	
	
	public List<historia> getHistory() {
		return history;
	}

	public void setHistory(List<historia> history) {
		this.history = history;
	}

	@Override
	public String toString() {
		return "konto [number=" + number + ", balance=" + balance + "]";
	}
}

