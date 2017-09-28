package hr.arr;

import java.util.Scanner;

public class TransformArr {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    int n = s.nextInt();
    int[] arr = new int[count];
    int i = 0;
    while (i < count) {
      arr[i] = s.nextInt();
      ++i;
    }
    s.close();
    for (int j = 0; j < arr.length; j++) {
      int k = arr[j];
      System.out.print(k + " ");
    }
    
    int ind1 = 0;
    int ind2 = n;
    int[] temp = new int[count];
    for (; ind2 < count; ind1++, ind2++) {
      temp[ind1] = arr[ind2];      
    }
    
    for (ind2 = 0; ind2 < n; ind1++, ind2++) {
      temp[ind1] = arr[ind2];
    }
    
    System.out.println("\n--------------");
    for (int j = 0; j < temp.length; j++) {
      int k = temp[j];
      System.out.print(k + " ");
    }
    
  }

}
