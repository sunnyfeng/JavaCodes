public class SumNum{
  public static void main (String[] args){
    int answer= 0;
    int input = 0;
    int n = IO.readInt();
    while (n<1){
      n = IO.readInt();
    }

    for (int i = 0; i < n; i++){
      input = IO.readInt();
      if (input%2 == 0){
        answer += input;
      }
    }

    IO.outputIntAnswer(answer);

  }
}
