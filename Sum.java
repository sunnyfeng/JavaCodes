public class Sum{
  public static void main (String [] args){

    System.out.println("Enter number: ");
    int num1 = IO.readInt();
    System.out.println("Enter number: ");
    int num2 = IO.readInt();

    int sum = num1 + num2;
    IO.outputIntAnswer(sum);
  }
}
