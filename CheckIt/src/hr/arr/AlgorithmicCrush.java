package hr.arr;

import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
	    int N, M, a, b;
	    long k; // int k;
	    Scanner in = new Scanner(System.in);
	    N = in.nextInt();
	    M = in.nextInt();
	    long[] differenceArray = new long[N+1]; // int[] ...
	    for (int i=0; i<M; i++) 
	    {
	        in.nextLine();
	        a = in.nextInt(); 
	        b = in.nextInt();
	        k = in.nextLong(); // in.nextInt();
	        differenceArray[a] += k;
	        if (b+1<=N)
	            differenceArray [b+1] -= k;
	    }

	    long max = 0, addedDifference = 0; // int
	    for (int i=1; i<=N; i++) 
	    {
	        addedDifference = addedDifference + differenceArray[i];
	        if (max < addedDifference)
	            max = addedDifference;
	    }
	    System.out.println(max);
	    in.close();

	}
}
