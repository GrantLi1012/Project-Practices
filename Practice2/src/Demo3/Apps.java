package Demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;
		}
	}
}

class ReverseAlphabeticalComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}

public class Apps {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("dog");
		animals.add("goose");

		System.out.println("Natural order");
		Collections.sort(animals);

		for (String animal : animals) {
			System.out.println(animal);
		}

		System.out.println("Defined length method");
		Collections.sort(animals, new StringLengthComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		System.out.println("Defined reverse alphabetic method");
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(23);
		numbers.add(4);
		numbers.add(16);
		numbers.add(17);
		
		//natural order
		Collections.sort(numbers);
		for (Integer number:numbers) {
			System.out.println(number);
		}
		//using anonymous class and sort reversely
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2); 
			}
			
		});
		for (Integer number:numbers) {
			System.out.println(number);
		}
		
		
		///////works for customized objects as well
		
	}

}
