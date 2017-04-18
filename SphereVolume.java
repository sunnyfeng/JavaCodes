public class SphereVolume{
  public static void main (String[] args){

    System.out.println("Enter the radius: ");

    double radius = IO.readDouble();

    if (radius >= 0){
      double Volume = (4.0/3.0)*(Math.PI)*radius*radius*radius;

      // println(4/3) prints 1. WHY? Because / is not division operator!
      //
      System.out.println("The volume of the sphere is: " + Volume);
    } else {
      System.out.println("This is not a valid radius. Sorry!");
    }

  }
}
