package j8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortLambda {

	public static void main(String[] args) {
		List<Emp> l = new ArrayList<>();
		l.add(new Emp("b", 20));
		l.add(new Emp("a", 10));
		l.add(new Emp("d", 40));
		l.add(new Emp("aa", 15));
		l.add(new Emp("c", 30));
		l.add(new Emp("A", 10));

		List<Emp> l2 = new ArrayList<>();
		l2.addAll(l);

		List<Emp> l3 = new ArrayList<>();
		l3.addAll(l);

		List<Emp> l4 = new ArrayList<>();
		l4.addAll(l);

		List<Emp> l5 = new ArrayList<>();
		l5.addAll(l);

		List<Emp> l6 = new ArrayList<>();
		l6.addAll(l);

		System.out.println(l);
		l.sort((e1, e2) -> e1.getName().compareTo(e2.getName())); // Sorting with no Type Definitions
		System.out.println(l);

		System.out.println("---------l2------------");
		l2.add(new Emp("a", 30));
		System.out.println(l2);
		l2.sort(Emp::compareByNameThenById); // Sort using Reference to Static Method
		System.out.println(l2);

		System.out.println("--------l3-------------");
		System.out.println(l3);
		Collections.sort(l3, Comparator.comparing(Emp::getName)); // Sort Extracted Comparators
		System.out.println(l3);

		System.out.println("--------l4-------------");
		System.out.println(l4);
		Comparator<Emp> myComp = (e1, e2) -> e1.getName().compareTo(e2.getName()); // reverse sorting-reversing the comparator
		l4.sort(myComp.reversed());
		System.out.println(l4);

		System.out.println("--------l5------------");
		System.out.println(l5);
		l5.sort((e1, e2) -> {// Sort with Multiple Conditions
			if (e1.getName().equals(e2.getName()))
				return e1.getId() - e2.getId();
			else
				return e1.getName().compareTo(e2.getName());
		});
		System.out.println(l5);

		System.out.println("---------l6------------");
		System.out.println(l6);
		l6.sort(Comparator.comparing(Emp::getName).thenComparing(Emp::getId)); //chain multiple comparators
		System.out.println(l6);
	}

}

class Emp {
	String name;
	int id;

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static int compareByNameThenById(Emp e1, Emp e2) {
		if (e1.getName().equals(e2.getName())) {
			return e1.getId() - e2.getId();
		} else {
			return e1.getName().compareTo(e2.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name + "-" + id;
	}
}
