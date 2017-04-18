public class SmallestLargest{
  public static void main (String[] args){
    System.out.println("Enter a terminating value: ");
    double term = IO.readDouble();
    double smallest = 0;
    double largest = 0;
    double switcher = 0;
    double inputNum = 0;
    System.out.println("Enter numbers: ");

//error check to make sure at least one number entered
    smallest = IO.readDouble();
    if( smallest == term){
      IO.reportBadInput();
      return;
    }

    largest = IO.readDouble();
    if (largest == term){
      largest = smallest;
      IO.outputDoubleAnswer(smallest);
      IO.outputDoubleAnswer(largest);
      return;
    }

    if (smallest > largest){
      switcher = smallest;
      smallest = largest;
      largest = switcher;
    }

    inputNum = IO.readDouble();
    while (inputNum != term){

      if (inputNum < smallest){
        smallest = inputNum;
      } else if (inputNum > largest){
        largest = inputNum;
      }

      inputNum = IO.readDouble();
    }

    IO.outputDoubleAnswer(smallest);
    IO.outputDoubleAnswer(largest);


  }
}
