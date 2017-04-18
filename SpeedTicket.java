public class SpeedTicket{
  public static void main (String[] args){
    System.out.println("What is your age?");
    int age = IO.readInt();
    System.out.println("What speed are you going?");
    int speed = IO.readInt();

    int fine = 0;

    if (speed<= 60){
      fine = 0;
    } else if (speed >60 && speed <=75){
      fine = 100;
    } else if (speed >75 && speed <= 90){
      fine = 200;
    } else if (speed > 90){
      fine = 500;
    }

    if (age >=18){
      System.out.println("You're over 18 I see.");
    } else {
      System.out.println("You're under 18. Silly kids.");
    }

    System.out.println("Your fine is " + fine + " dollars. Drive safer, young-un.");


  }
}
