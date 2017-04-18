public class Factorial{
  public static void main (String[] args){
    int n = IO.readInt();
    int sum = 1;
    while (n<0){
      n = IO.readInt();
    }
    for (int i = 0; i < n; i++){
      sum *= (n-i);
    }

    IO.outputIntAnswer(sum);
  }
}
