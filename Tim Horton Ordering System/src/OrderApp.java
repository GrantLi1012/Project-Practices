import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {

		int orderCount = 1;
		System.out.println("Enter total customer number per day: ");
		Scanner input = new Scanner(System.in);

		int maxCustomers = input.nextInt();

		File costs = new File("Order costs.txt");
		File times = new File("Order time.txt");

		//// I don't know how to add items infinitely without loops

		for (int i = 0; i < maxCustomers; i++) {
			ArrayList<Double> costOfOrder = new ArrayList<Double>();
			ArrayList<Long> startTime = new ArrayList<Long>();
			ArrayList<Long> elapse = new ArrayList<Long>();

			Order order = new Order(orderCount);

			costOfOrder.add(order.getTotalCost());
			try (BufferedWriter br1 = new BufferedWriter(new FileWriter(costs))) {
				br1.write(orderCount + ": " + order.getTotalCost());
				br1.newLine();
			} catch (IOException e) {
				System.out.println("Can't write to file " + costs.toString());
			}
			startTime.add(System.currentTimeMillis());

			orderCount++;

			///////// Best way I thought of to calculate time taken for orders//////
			System.out.println("Enter finished order number, 0 for none: ");
			Scanner input0 = new Scanner(System.in);
			int finishedOrder = input0.nextInt();

			while (finishedOrder != 0) {
				long endTime = System.currentTimeMillis();
				long elapseTime = endTime - startTime.get(finishedOrder - 1);
				elapse.add(elapseTime);
				long elapseSec = elapseTime / 1000;
				System.out.println("Order " + finishedOrder + " took time: " + elapseSec + "s");
				try (BufferedWriter br2 = new BufferedWriter(new FileWriter(times))) {
					br2.write(finishedOrder + ": " + elapseSec + "s");
					br2.newLine();
				} catch (IOException e) {
					System.out.println("Can't write to file " + costs.toString());
				}
				System.out.println("Enter next finished order: ");
				finishedOrder = input0.nextInt();

			}

		}

	}

}
