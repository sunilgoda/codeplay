package hr.arr;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedianHeap {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();
    }
    double[] medians = getMedians(a);
    for (int i = 0; i < medians.length; i++) {
      System.out.println(medians[i]);
    }
  }

  public static double[] getMedians(int[] a) {
    PriorityQueue<Integer> highs = new PriorityQueue<Integer>();
    PriorityQueue<Integer> lows = new PriorityQueue<Integer>(100, new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        return -1 * a.compareTo(b);
      }
    });
    double[] medians = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      addNum(a[i], highs, lows);
      rebalanceHeap(highs, lows);
      medians[i] = getMedian(highs, lows);
    }
    return medians;
  }

  public static void addNum(int num, PriorityQueue<Integer> highs, PriorityQueue<Integer> lows) {
    if (lows.size() == 0 || num < lows.peek()) {
      lows.add(num);
    } else {
      highs.add(num);
    }
  }

  public static void rebalanceHeap(PriorityQueue<Integer> highs, PriorityQueue<Integer> lows) {
    PriorityQueue<Integer> big = lows.size() > highs.size() ? lows : highs;
    PriorityQueue<Integer> small = lows.size() > highs.size() ? highs : lows;

    if (big.size() - small.size() >= 2) {
      small.add(big.poll());
    }

  }

  public static double getMedian(PriorityQueue<Integer> highs, PriorityQueue<Integer> lows) {
    PriorityQueue<Integer> big = lows.size() > highs.size() ? lows : highs;
    PriorityQueue<Integer> small = lows.size() > highs.size() ? highs : lows;
    if (big.size() == small.size()) {
      return (double) (big.peek() + small.peek()) / 2;
    } else {
      return big.peek();
    }
  }

}
