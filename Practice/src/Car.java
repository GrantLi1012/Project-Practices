//Car inherits/derived from Machine
//it has all the methods that machine has

public class Car extends Machine {
	
	public void wipeWindow() {
		System.out.println("Wiping");
	}

	
	//This is a type of annotation
	//helps to check if override is successful
	@Override
	public void start() {
	    System.out.println("Car started.");
	}
}
