package Demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	///generating hashcode&equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	////make your own order(length in this case)
	@Override
	public int compareTo(Person person) {
		int len1 = name.length();
		int len2 = person.name.length();
		if(len1>len2) {
			return 1;
		}
		else if(len1<len2) {
			return -1;
		}
		else {
			//make sure that different names of same length
			//is not excluded
			return name.compareTo(person.name);
			//so now these names of same length
			//will have alphabetical orders
		}
	}
}

public class NaturalOrder {

	public static void main(String[] args) {
		/// They both apply super interface of Collection
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();
		// Tree set contain only unique elements
		// So make sure compareTo and equals returns the same answer
		// In case u have elements of same comparable feature

		addElements(list);
		addElements(set);
		
		Collections.sort(list);

		showElements(list);
		System.out.println("\n");
		showElements(set);
	}

	private static void addElements(Collection<Person> col) {
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Mike"));
		col.add(new Person("Leo"));
		col.add(new Person("Aaron"));

	}

	private static void showElements(Collection<Person> col) {
		for (Person element : col) {
			System.out.println(element);
		}

	}
}
