package hr.arr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		List<Integer> list = new ArrayList<>();
		while (s.hasNext()) {
			list.add(Integer.parseInt(s.next()));
		}

		for (int i = list.size(); i >= 0; i--) {
			System.out.println(list.get(i));
		}
		s.close();
	}

}
