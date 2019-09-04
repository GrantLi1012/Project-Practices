package inheritance;

public class Sedan extends Car{
	
	private int length;
	
	public Sedan(String color, double regularPrice, int speed, int length) {
		super(color, regularPrice, speed);
		this.length = length;
	}
	
	public double getPrice() {
		if(length>20) {
			return 0.95*(super.getPrice());
		}
		else {
			return 0.9*(super.getPrice());
		}
	}

	
}
