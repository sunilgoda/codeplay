package hr.arr;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**Checkout RunningMedianHeap.java*/
public class RunningMedian {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextDouble();
        }
        in.close();
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        df.setMinimumFractionDigits(1);
        
        double[] b = new double[1];
        b[0] = a[0];        
        System.out.println(df.format(b[0]));   
        
        for(int i = 1; i < n ;i++){
            b = ensureCapacity(b,i);
            b[i] = a[i];
            while(b[i] < b[i-1]){
                swapItems(b,i);    

            }
            double median = getMedian(b);             
            System.out.println(df.format(median));   
        }
    }
    static double[] ensureCapacity(double[] a,int i){
        if(a.length < i+1){
            a = Arrays.copyOf(a,i+1);
        }
        return a;
    }
    static void swapItems(double[] a,int i){
        double temp = a[i];
        a[i] = a[i-1];
        a[i-1] = temp;
    }
    
    static double getMedian(double[] a){
        if(a.length == 1) return a[0];
        
        //System.out.println(Arrays.toString(a));
        int middle = a.length /2;
        if(a.length % 2 == 0){
            return (a[middle - 1] + a[middle])/2;
        }else{
            return a[middle];
        }
    }


}