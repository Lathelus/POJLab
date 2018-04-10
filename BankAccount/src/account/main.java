package account;

public class main {

	public static void main(String[] args) {
		konto acc1 = new konto("123", 1000);
		konto acc2 = new konto("122", 500);
		
		System.out.println(acc1);
		System.out.println(acc2);
		acc1.transfer(acc2, 100);
		System.out.println(acc1);
		System.out.println(acc2);
		
		//System.out.println(acc2);
	}

}
