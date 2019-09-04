package inheritance;

public class Car {
	private String color;
	private double regularPrice;
	private int speed;
	
	public Car(String color,double regularPrice,int speed) {
		this.color = color;
		this.regularPrice = regularPrice;
		this.speed = speed;
	}
	
	public double getPrice() {
		return regularPrice;
	}
}
