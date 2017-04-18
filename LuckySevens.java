public class LuckySevens{
  public static void main(String[] args){
    
    System.out.println("Enter range (inclusive): ");
    int start = IO.readInt();
    int end = IO.readInt();

    if (end < start){
      IO.reportBadInput();
      return;
    }

    int answer = 0;

    for (int i = start; i <= end; i++){
        int num = i;

        //when the value is greater than 0, find digits of 7
        while (num>0){
          if (Math.abs(num%10) ==7){
            answer++;
          }
          num = num/10;
        }

        //when negative
        while (num < 0){
          if (Math.abs(num%10)==7){
            answer++;
          }
          if (Math.abs(num/10)==7){
            answer++;
          }
          num = Math.abs(num)/10;
        }

        //move onto next number when num now == 0
        while (num == 0){
          break;
        }
      }

      IO.outputIntAnswer(answer);

  }
}
