package hr.codechallenge;

import java.io.IOException;
import java.util.Scanner;

public class BudgetShopping {
    
    // Complete the budgetShopping function below.
    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {
	int maxAmt = n;
	int maxBooks = 0;

	int currQty = 0;
	int currCost = 0;
	int currBooks = 0;
	for (int i = 0; i < bundleQuantities.length; i++) {
	    currQty = bundleQuantities[i];
	    currCost = bundleCosts[i];
	    if (n % currCost < maxAmt) {
		currBooks = (n / currCost) * currQty;
		if (currBooks > maxBooks) {
		    maxBooks = currBooks;
		}
	    }
	}
	return maxBooks;
    }

    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	//System.setProperty("OUTPUT_PATH", "C:\\Users\\sgoda\\Desktop\\delete\\coding");
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int bundleQuantitiesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] bundleQuantities = new int[bundleQuantitiesCount];

        for (int i = 0; i < bundleQuantitiesCount; i++) {
            int bundleQuantitiesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            bundleQuantities[i] = bundleQuantitiesItem;
        }

        int bundleCostsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] bundleCosts = new int[bundleCostsCount];

        for (int i = 0; i < bundleCostsCount; i++) {
            int bundleCostsItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            bundleCosts[i] = bundleCostsItem;
        }

        int res = budgetShopping(n, bundleQuantities, bundleCosts);

        System.out.println(res);
        
        //bufferedWriter.write(String.valueOf(res));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }


}
