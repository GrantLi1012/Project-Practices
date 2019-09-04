package Demo3;

import java.util.AbstractQueue;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue {

	public static void main(String[] args) {
		// (head) <-ooooooooo<- (tail)
		// first in first out structure
		// go google/oracle for more info
		
		AbstractQueue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		///ADD
		q1.add(10);
		q1.add(3);
		q1.add(4);
		/////use q1.offer(), return false when can't add
		
		///ELEMENT(throws no such element exception)
		System.out.println("Head of queue is: "+q1.element());
		/////use q1.peek()
		
		//unchecked exception
		try {
			q1.add(14);
		}catch(IllegalStateException e) {
			System.out.println("Tried to add too many items.");
		}
		
		for(Integer value:q1) {
			System.out.println("Queue value: "+value);
		}
		
		///REMOVE
		System.out.println("Removed: "+q1.remove());
		System.out.println("Removed: "+q1.remove());
		System.out.println("Removed: "+q1.remove());
		///use q1.poll() , throws interrupted exception
		try {
			System.out.println("Removed: "+q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove too many items.");
		}
		
		
		
	
	}

}
