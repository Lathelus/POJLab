package loan;

public class Main {

	public static void main(String[] args) {
		LoanApplication appl = new LoanApplication();
		
		String firstName = null;
		appl.setFirstName(firstName);
		System.out.println(appl);
		
		firstName = "A";
		appl.setFirstName(firstName);
		System.out.println(appl);

		firstName = "$123";
		appl.setFirstName(firstName);
		System.out.println(appl);

		firstName = "Ala";
		appl.setFirstName(firstName);
		System.out.println(appl);
	}
}

