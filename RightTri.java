public class RightTri{
  public static void main (String [] args){
    System.out.println("First triangle side length?");
    double a = IO.readDouble();
    System.out.println("Second triangle side length?");
    double b = IO.readDouble();
    System.out.println("Third triangle side length?");
    double c  = IO.readDouble();

    boolean isRightTri = true;

    //error check

    if (a <=0 || b <=0 || c<=0){
      //if negative or 0
      System.out.println("Can't have negative or zero lengths.");
      IO.reportBadInput();
      return;
    } else if ((a + b) <= c || (a + c) <= b || (b + c) <= a){
      // if not a possible triangle - if hypotenuse greater than sum of two sides
      System.out.println("Sides don't make a triangle.");
      IO.reportBadInput();
      return;
    } else {

    //run program if the values are good

        //is it right trianle? a^2 + b^2 = c^2
        if ((a*a + b*b) == c*c || (a*a + c*c) == b*b || (c*c + b*b) == a*a){
            isRightTri = true;
        } else{
            isRightTri = false;
        }

        //display if right tri or not
        System.out.println("The answer to whether these make a right triangle is: ");
        IO.outputBooleanAnswer(isRightTri);

    }
  }
}
