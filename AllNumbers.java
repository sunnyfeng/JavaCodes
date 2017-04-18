public class AllNumbers{
  public static void main (String[] args){
    int n = 0;

    while (n<=0){
      n = IO.readInt();
    }

    int counter = 1;
    while (counter <=n){
      System.out.println(counter);
      counter = counter +1;
    }
  }
}
