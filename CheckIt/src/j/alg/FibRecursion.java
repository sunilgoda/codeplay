package j.alg;

public class FibRecursion {

	public static void main(String[] args) {
		System.out.println(fib(8));
		System.out.println(oneLinefib(8));
		System.out.println(fibSeries(8));
	}
	
	private static int fib(int i){
		if(i == 0 || i == 1) return i;		
		return fib(i -1) + fib(i-2);
	}
	
	private static int oneLinefib(int i){
		return ( i == 0 || i == 1) ? i : oneLinefib(i -1) + oneLinefib(i-2);
	}

	private static int fibSeries(int i){
		if(i <= 1) {			
			return i;
		}
		return (fibSeries(i -1 ) + fibSeries( i - 2));
	}
}
