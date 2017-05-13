package hr.str;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int k =0;
		for (char c : s.toCharArray()) {
			if (c >= 65 && c <= 90)
				k = c + 32;
			else if (c >= 97 && c <= 122)
				k = c - 32;
			System.out.print((char) k);
		}
		String s1 = "hello ";
		s1 = s1 + s;
		System.out.println("\n" + s1);
		scanner.close();
	}

}
