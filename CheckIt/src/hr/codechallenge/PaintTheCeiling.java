package hr.codechallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PaintTheCeiling {

    // Complete the variantsCount function below.
    static long variantsCount(int n, int s0, int k, int b, int m, long a) {
	long[] s = new long[n];
	s[0] = s0;
	
	for(int i =1 ;i < n;i++){
	    s[i] = (k * s[i-1] + b) %m + 1 + s[i-1];
	}
	
	
	long count = 0;
	Map<Integer,Integer> exceededNums = new HashMap<>();
	for (int i = 0; i < n; i++) {
	    if(s[i] > a) continue;
	    if(exceededNums.containsKey(i)) continue;
	    
	    for (int j = 0; j < n; j++) {
		if (s[i] * s[j] <= a) {
		    count++;
		} else {
		    exceededNums.put(j, i);
		    break;
		}
	    }
	}
	return count;
    }
    
    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(bufferedReader.readLine().trim());

	int s0 = Integer.parseInt(bufferedReader.readLine().trim());

	int k = Integer.parseInt(bufferedReader.readLine().trim());

	int b = Integer.parseInt(bufferedReader.readLine().trim());

	int m = Integer.parseInt(bufferedReader.readLine().trim());

	long a = Long.parseLong(bufferedReader.readLine().trim());

	long res = variantsCount(n, s0, k, b, m, a);

	System.out.println(res);
	bufferedReader.close();
    }
}
