public class TwoSmallest{
  public static void main (String[] args){

    System.out.println("Enter a terminating value: ");
    double term = IO.readDouble();
    double small1 = 0;
    double small2 = 0;
    double switcher = 0;
    double inputNum = 0;
    System.out.println("Enter numbers: ");

//error check to make sure at least two terms entered
    small1 = IO.readDouble();
    while (small1 == term){
      IO.reportBadInput();
      small1 = IO.readDouble();
    }

    small2 = IO.readDouble();
    while (small2 == term){
      IO.reportBadInput();
      small2 = IO.readDouble();
    }

//make small1 the smallest
    if (small1 > small2){
      switcher = small1;
      small1 = small2;
      small2 = switcher;
    }

    inputNum = IO.readDouble();
    while (inputNum != term){

      if (inputNum < small1){
        small2 = small1;
        small1 = inputNum;
      } else if (inputNum <= small2){
        small2 = inputNum;
      }

      inputNum = IO.readDouble();
    }

      System.out.println("Smallest: ");
      IO.outputDoubleAnswer(small1);
      System.out.println("Second smallest: ");
      IO.outputDoubleAnswer(small2);

  }
}
