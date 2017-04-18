public class PrimeTest{

  public static void main (String[] args){
    System.out.println("Enter number greater than 1 to test: ");
    int n = IO.readInt();

    if (n < 1){
      IO.reportBadInput();
    } else {
      System.out.println("Is it prime?:");
      System.out.println(isPrime(n));
  }

  }

//numbers bigger than 2
  public static boolean isPrime(int x){
    boolean answer = true;

    if (x == 1) return false;
    if (x ==2){
      return true;
    }

      for (int i = 2; i < x; i++){
        if (x%i == 0){
          //if at all divisible, not prime
          answer = false;
        }
      }
      return answer;
  }
}
