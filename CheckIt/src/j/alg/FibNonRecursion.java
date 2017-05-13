package j.alg;

import java.util.Arrays;

public class FibNonRecursion {

	public static void main(String[] args) {
		fibAsc(9);
		fibDesc(9);
	}

	private static void fibDesc(int c) {
		c++;
		int[] f = new int[c];
		f[0] = 0;
		f[1] = 1;
		for (int i = f.length; i > 1 ; i--) {
			//TODO
		}
	}

	private static void fibAsc(int c) {
		c++;
		int[] f = new int[c];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < c; i++) {
			f[i] = f[i -1] + f[i-2];
		}
		System.out.println(Arrays.toString(f));
	}

}
