package j.alg;

public class SumOfSubsets {

  public static void main(String[] args) {
    int[] arr = {2,3,6};
    int sum = 5;
    int n = arr.length;
    boolean isSubsetSumExists = isSubsetSumExists(arr,n,sum);
    System.out.println("Subset with sum " + (isSubsetSumExists ? "exists": "does not exist"));
  }

  private static boolean isSubsetSumExists(int[] arr,int n, int sum) {
    if(sum == 0) return true;
    if(n == 0 && sum !=0) return false;
    
    if(arr[n -1] > sum){
      return isSubsetSumExists(arr, n-1, sum);
    }
    
    return isSubsetSumExists(arr, n-1, sum) || isSubsetSumExists(arr, n-1, sum-arr[n-1]);
  }

}
