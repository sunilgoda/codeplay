package hr.arr;

import java.util.Scanner;

public class ShortestTightArray {

	static int shortestTightArray(int a, int b, int c) {
		return Math.abs(b - a) + Math.abs(c - b) + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int result = shortestTightArray(a, b, c);
		System.out.println(result);
	}
}
