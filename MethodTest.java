public class MethodTest{

  public static void main (String[] args){
    System.out.println("Enter two numbers to multiply: ");
    int a = IO.readInt();
    int b = IO.readInt();

    //int z = MethodTest.multiply(IO.readInt(), IO.readInt());
    //above still works

    IO.outputIntAnswer(multiply(a,b));

  }

  //assume two integers 0 or pos
  public static int multiplyMINE(int a, int b){
    int answer = 0;

    //if b is pos and a is neg or pos
    if (b >= 0){
      for (int i = 0; i < b; i++){
        answer +=a;
      }

    //if a negative and b negative
    } else if (a>=0 && b<= 0){
      for(int i = 0; i <a; i++){
        answer += b;
      }

    //if both negative
    } else if (a<=0 && b<=0){
      for (int i = b; i < 0; i++){
      answer -=a;
      }
    }

      return answer;
  }

//the one done in class
  public static int multiply(int a, int b){
    int prod = 0;
    int c = b;
    if (b<0){
      c = 0-b;
    }
    for (int i = 0; i < c; i++){
      prod+= a;
    }

    if (b < 0){
      return 0-prod;
    } else {
      return prod;
    }

    }

  }
