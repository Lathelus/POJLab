
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("BMW", true, 0, 100000.99);
		
		car.printCar();
		
		System.out.println("zmiana wartości");
		
		car.setMilleage(100);
		
		System.out.println("nowy przebieg: " + car.getMilleage());
	}

}
