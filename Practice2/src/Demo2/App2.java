package Demo2;

public class App2 {

	public static void main(String[] args) {

		Animal animal = Animal.CAT;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}

		System.out.println(Animal.DOG);// ToString: This animal is called Lily
        System.out.println(Animal.DOG.name());//enum name is : DOG
		System.out.println(Animal.DOG.getClass());// class Demo2.Animal
		System.out.println(Animal.DOG instanceof Enum);// true
		System.out.println(Animal.DOG.getName());// Lily
		
		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);//This animal is called Miki

	}

}
