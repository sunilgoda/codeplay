package j.alg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ThirdLargestNumber {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	List<Integer> nums = new ArrayList<>();
	List<Integer> nums2 = new ArrayList<>();
	List<Integer> nums3 = new ArrayList<>();
	
	int size =    scan.nextInt();
	for (int i = 0; i < size; i++) {
	    nums.add(scan.nextInt());
	}
	nums2.addAll(nums);
	nums3.addAll(nums);
	scan.close();
	
	Collections.sort(nums);
	System.out.println("3rd largest: "+ nums.get(size -3));
	System.out.println("--------------------");
	
	int l1 = 0;
	int l2 = 0;
	int l3 = 0;
	for (Integer i : nums2) {
	    if(i > l3){
		if(i > l2){
		    if(i > l1){
			l3 = l2;
			l2 = l1;
			l1 = i;
		    }else{
			l3 = l2;
			l2 = i;
		    }
		}else{
		    l3 =i;
		}
	    }
	}
	System.out.println("3rd largest -2nd way:" +l3);
	System.out.println("--------------------");
	
	int kth = findKthLargest(nums3, 3);
	System.out.println("3rd largest -3rd way:" +kth);
    }
    
    public static int findKthLargest(List<Integer> nums, int k) {
	PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	for (int i : nums) {
	    q.offer(i);

	    if (q.size() > k) {
		q.poll();
	    }
	}

	return q.peek();
    }

}
