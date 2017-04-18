public class NumberPrint{
  public static void main (String [] args){

    System.out.println("Input n (int): ");
    int n = IO.readInt();

    while (n<1){
      IO.reportBadInput();
      n = IO.readInt();
    }

    for (int i = 1; i <= n; i++){
      for (int j = 1; j <=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
