public class LuckyNines{
  public static void main(String[] args){

    System.out.println("Give range (inclusive): ");
    int start = IO.readInt();
    int end = IO.readInt();
    IO.outputIntAnswer(countLuckyNines(start,end));

  }

  public static int countLuckyNines(int lowerEnd, int upperEnd){

    if (upperEnd < lowerEnd){
      return -1;
    }

    int answer = 0;

    for (int i = lowerEnd; i <= upperEnd; i++){
        int num = i;

        //when the value is greater than 0, find digits of 7
        while (num>0){
          if (Math.abs(num%10) ==9){
            answer++;
          }
          num = num/10;
        }

        //when negative
        while (num < 0){
          if (Math.abs(num%10)==9){
            answer++;
          }
          if (Math.abs(num/10)==9){
            answer++;
          }
          num = Math.abs(num)/10;
        }

        //move onto next number when num now == 0
        while (num == 0){
          break;
        }
      }

      return answer;
  }

}
