package inheritance;

public class Ford extends Car {
	
	private int year;
	private int manufacturingDiscount;
	
	public Ford(String color, double regularPrice, int speed, int year, int manufacturingDiscount) {
		super(color, regularPrice, speed);
		this.year = year;
		this.manufacturingDiscount = manufacturingDiscount;
	}
	
	public double getPrice() {
		return (super.getPrice()-manufacturingDiscount);
	}

}
