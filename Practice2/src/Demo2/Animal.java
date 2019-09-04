package Demo2;

public enum Animal {
	//objects of type animal
	CAT("Miki"),DOG("Lily"),MOUSE("Jerry");
	
	private String name;
	
	Animal(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This animal is called "+name;
	}
	
	
}
