package inheritance;

public class Truck extends Car{
	
	private int weight;

	public Truck(String color, double regularPrice, int speed, int weight) {
		super(color, regularPrice, speed);
		this.weight = weight;
	}
	
	public double getPrice() {
		if (weight>2000) {
			return 0.9*(super.getPrice());
		}
		else {
			return 0.8*(super.getPrice());
		}
	}
}
