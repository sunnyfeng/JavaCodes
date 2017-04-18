public class Smallest{
  public static void main (String[] args){
    boolean divisible = true;
    for (int i = 1; i< Integer.MAX_VALUE; i++){
      divisible = true;
      for (int j = 1; j<= 20; j++){
        if (i%j!=0){
          divisible = false;
          break;
        }

      }
      if (divisible == true){
        System.out.println(i);
        break;
      }
    }
  }
}
