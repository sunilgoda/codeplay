package j.alg;

public class PrimeCheck {

  public static void main(String[] args) {
    int n = 9;
    
    boolean isPrime = isPrime(n);
    System.out.println(isPrime ? "Prime" : "Not prime");
  }

  private static boolean isPrime(int n) {
    if (n < 2) return false;
    
    for (int i = 2; i <= Math.sqrt(n); i++) {
      System.out.println(i);
      if (n % i == 0) return false;
    }
    return true;
  }
  
  
}
