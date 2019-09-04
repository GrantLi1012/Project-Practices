package inheritance;

public class Auto_Store {

	public static void main(String[] args) {
		Sedan mySedan1 = new Sedan("Red",20000,160, 10);
		Ford myFord1 = new Ford("Green",4452.0,156,2005,10);
		Ford myFord2 = new Ford("Yellow", 2634.3,153,2003,5);
		Car car = new Car("Black", 2483.0,555);
		
		System.out.printf("MySedan1 price: %.2f\n",mySedan1.getPrice());
		System.out.printf("MyFord1 price: %.2f\n",myFord1.getPrice());
		System.out.printf("MyFord2 price: %.2f\n",myFord2.getPrice());
		System.out.printf("Car price: %.2f\n",car.getPrice());
	}

}
