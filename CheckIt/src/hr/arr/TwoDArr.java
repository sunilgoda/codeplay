package hr.arr;

import java.util.Scanner;

public class TwoDArr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = "";
		// 6 * 6
		int len = 6;
		int[][] tda = new int[len][len];
		String[] splitStrArr = new String[len];
		int tdaInd = 0;
		/*
		 * while (scan.hasNextLine()) { line = scan.nextLine(); if (line == null
		 * || line.trim().length() == 0) { scan.close(); break; }
		 * 
		 * splitStrArr = line.split(" "); for (int i = 0; i <
		 * splitStrArr.length; i++) { tda[tdaInd][i] =
		 * Integer.parseInt(splitStrArr[i]); } tdaInd++; }
		 */

		tda[0] = new int[] { 1, 1, 1, 0, 0, 0 };
		tda[1] = new int[] { 0, 1, 0, 0, 0, 0 };
		tda[2] = new int[] { 1, 1, 1, 0, 0, 0 };
		tda[3] = new int[] { 0, 9, 2, -4, -4, 0 };
		tda[4] = new int[] { 0, 0, 0, -2, 0, 0 };
		tda[5] = new int[] { 0, 0, -1, -2, -4, 0 };
		
		String[][] stda = new String[len][len];
		stda[0] = new String[] { "00", "01", "02", "03", "04", "05" };
		stda[1] = new String[] { "10", "11", "12", "13", "14", "15" };
		stda[2] = new String[] { "20", "21", "22", "23", "24", "25" };
		stda[3] = new String[] { "30", "31", "32", "33", "34", "35" };
		stda[4] = new String[] { "40", "41", "42", "43", "44", "45" };
		stda[5] = new String[] { "50", "51", "52", "53", "54", "55" };

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(tda[i][j] + " ");
			}
			System.out.println(" ");
		}

		int maxSum = Integer.MIN_VALUE;
		int sum = 0;

		System.out.println("----------------------------------------------");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int i2 = i; i2 < i + 3; i2++) {
					for (int j2 = j; j2 < j + 3; j2++) {
						if((i2 == i +1 && j2 == j)|| (i2==i + 1 && j2 == j+ 2)) {
							System.out.print("  ");
							continue;
						}
						System.out.print(tda[i2][j2] + " ");
					}
					System.out.println();
				}
				System.out.println("-----");
			}
		}
		
		System.out.println("----------------------------------------------");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = 0;
                int p = 0,q = 0;
				for (int i2 = i; i2 < i + 3; i2++) {
					for (int j2 = j; j2 < j + 3; j2++) {
                        //if((i2 == i +1 && j2 == i)|| (i2==i + 1 && j2 == i+ 2)) continue;
						sum += tda[i2][j2];
                        q=j2;
					}
                    p=i2;
				}
                sum = sum - tda[p - 1][q - 2] - tda[p - 1][q];
				if (maxSum < sum)
					maxSum = sum;
			}
		}
		System.out.println("maxSum:::"+maxSum);	
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = 0;
				for (int i2 = i; i2 < i + 3; i2++) {
					for (int j2 = j; j2 < j + 3; j2++) {
						if((i2 == i +1 && j2 == j)|| (i2==i + 1 && j2 == j+ 2)) {
							continue;
						}
						sum += tda[i2][j2];
					}
				}
				if (maxSum < sum)
					maxSum = sum;
			}
		}
		System.out.println("maxSum:::"+maxSum);	
	}

}
