package Demo2;

public class Robot {

	private int id;

	// non-static inner class can access outer instances
	// helps to group things
	// doesn't create object with robot object
	private class Brain {
		public void think() {
			System.out.println(id + " is thinking.");
		}
	}

	//static inner class groups with outer class
	static class Battery{
		public void charge() {
			//static class can't access out instance
			System.out.println("Charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	};

	public void start() {
		System.out.println("Starting robot: " + id);

		Brain brain = new Brain();
		brain.think();
		
		//you can define class in methods
		class Temp {
			public void doSomething() {
				//can refer to instance data
				//can refer to final local data
				System.out.println("My name is "+id);
			}
		}
		
		Temp temp = new Temp();
		temp.doSomething();
	}

}
