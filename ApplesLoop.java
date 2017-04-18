public class ApplesLoop{
  public static void main (String[] args){

    int bob, sally;

    do {
      System.out.println("Enter the number of Bob's apples: ");
      bob = IO.readInt();

      if (bob<0){
        System.out.println("Error. Enter non-negative integer!")      }
    } while(bob <0);

    do {
      System.out.println("Enter the number of Sally's apples: ");
      sally = IO.readInt();

      if (sally<0){
        System.out.println("Error. Enter non-negative integer!")
    } while(sally <0);


    int total = sally + bob;

    System.out.println("The total number of apples is: " + total);

  }
}
