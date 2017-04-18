public class Apples{
  public static void main (String[] args){

    System.out.println("Enter the number of Bob's apples: ");
    int bob;
    bob = IO.readInt();

    System.out.println("Enter the number of Sally's apples: ");
    int sally = IO.readInt();

    int total = sally + bob;

    System.out.println("The total number of apples is: " + total);

  }
}
