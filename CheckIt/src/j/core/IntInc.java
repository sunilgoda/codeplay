package j.core;

public class IntInc {

    public static void main(String[] args) {
	int num;
	num = 10;

	do
	    while (num++ < 10)
		;
	while (num++ <= 11);
	System.out.printf("%d", num);// 14
	System.out.println("\n-------------------");
	
	num = 10;
	do {
	    System.out.println("before: " + num);
	    while (num++ < 10)
		;
	    System.out.println("after: " + num);
	} while (num++ <= 11);
	System.out.printf("%d", num);

    }

}
