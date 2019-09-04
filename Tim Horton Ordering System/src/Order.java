import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Order {
	
	private static final double TAXRATE = 0.13; 

	private int orderNumber;
	private double totalCost;
	private int timeTaken;


	// make order (generating tracking number & sum price)
	public Order(int orderCount) {
		orderNumber = orderCount;
		
		System.out.println("Ordering for custormer number "+ orderNumber);
		totalCost = 0;

		// prompt for product type
		totalCost = getPrice(totalCost);
		//get price with tax
		totalCost = totalCost*(1+TAXRATE);

		System.out.printf("Total cost is: %.3f\n",totalCost);
	}
	

	public int getOrderNumber() {
		return orderNumber;
	}



	public double getTotalCost() {
		return totalCost;
	}




	// prompt for order and calculate price
	public double getPrice(double currentCost) {

////////////////Prices for products//////////////

// prices for hot drink (1)
		Map<String, Double> hotDrink = new HashMap<String, Double>();
		hotDrink.put("S", 1.9);
		hotDrink.put("M", 2.9);
		hotDrink.put("L", 3.5);
// prices for cold drink (2)
		Map<String, Double> coldDrink = new HashMap<String, Double>();
		coldDrink.put("S", 2.9);
		coldDrink.put("M", 3.9);
		coldDrink.put("L", 4.5);
// prices for doughnuts (3)
		Map<String, Double> doughnuts = new HashMap<String, Double>();
		doughnuts.put("R", 0.9);
		doughnuts.put("S", 1.99);
// prices for pastries
		Map<String, Double> pastries = new HashMap<String, Double>();
		pastries.put("S", 2.99);
		pastries.put("C", 1.5);
		pastries.put("M", 2.99);

///////////////////////////////////////////////

		double costCalculated = currentCost;
		System.out.println("Enter product code:");
		System.out.println("1:hot drink\n2:cold drink\n3:doughnuts\n4:pastries\n0:change order\n9:check out");
		Scanner input = new Scanner(System.in);
		int code = input.nextInt();

		while (code != 9) {
			if (code == 1) {
			System.out.println("Enter size:");
			Scanner input1 = new Scanner(System.in);
			costCalculated += hotDrink.get(input1.nextLine());
			System.out.println("Enter next code: ");
			code = input.nextInt();
			}
			else if (code == 2) {
				System.out.println("Enter size:");
				Scanner input2 = new Scanner(System.in);
				costCalculated += coldDrink.get(input2.nextLine());
				System.out.println("Enter next code: ");
				code = input.nextInt();
			}
			else if (code == 3) {
				System.out.println("Enter R for regular and S for special:");
				Scanner input3 = new Scanner(System.in);
				costCalculated += doughnuts.get(input3.nextLine());
				System.out.println("Enter next code: ");
				code = input.nextInt();
			}
			else if (code == 4) {
				System.out.println("Enter S for scone, C for cookie, and M for muffin:");
				Scanner input4 = new Scanner(System.in);
				costCalculated += pastries.get(input4.nextLine());
				System.out.println("Enter next code: ");
				code = input.nextInt();
			}
			else if (code == 0) {
				costCalculated = changeOrder(costCalculated);
				System.out.println("Enter next code: ");
				code = input.nextInt();
			}
			
		}

		return costCalculated;
	};
	
	
	// change order
	public double changeOrder(double currentCost) {
		//////I'm lazy so I'll just prompt for price changed here
		double changedCost = currentCost;
		System.out.println("Enter 1 to add and 2 to remove product:");
		Scanner input0 = new Scanner(System.in);
		if(input0.nextInt()==1) {
			System.out.println("Enter added amount: ");
			Scanner input00 = new Scanner(System.in);
			changedCost += input00.nextDouble();
		}
		else {
			System.out.println("Enter removed amount: ");
			Scanner input000 = new Scanner(System.in);
			changedCost -= input000.nextDouble();
		}
		return changedCost;
	}
	
	// cancel order
	// sum price
	// calculate finishing time

}
