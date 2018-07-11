package j.core;

public class IncrementArrIndex {

    public static void main(String[] args) {
	int a[] = {5, 1, 15, 20, 25};
	int i, j, m;
	i = ++a[1];
	System.out.println(i);
	j = a[1]++;
	System.out.println(j);
	m = a[i++];
	System.out.println(m);
	System.out.printf("%d, %d, %d", i, j, m);

    }

}
