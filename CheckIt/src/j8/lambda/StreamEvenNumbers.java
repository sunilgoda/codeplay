package j8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenNumbers {

    public static void main(String[] args) {
	List<String> strList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8");
	System.out.println("All numbers:\n"+strList);

	List<Integer> intList = strList.stream().map(i -> Integer.valueOf(i)).filter(i -> i % 2 == 0)
		.collect(Collectors.toList());
	
	System.out.println("Even numbers:");
	for (Integer integer : intList) {
	    System.out.println(integer);
	}
    }

}
