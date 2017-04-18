public class Change{
  public static void main(String[] args){
    System.out.println("What is the total sales charge?");
    double charge = IO.readDouble();
    System.out.println("How much is the customer giving?");
    double pay = IO.readDouble();

    while (pay < charge){
      System.out.println("Not enough money!");
      pay = IO.readDouble();
    }

    double payBack = pay - charge;
    int bill20 = 0;
    int bill10 = 0;
    int bill5 = 0;
    int bill1 = 0;
    int quarter = 0; int dime = 0; int nickel = 0; int penny = 0;

    while (payBack/20 >= 1){
      bill20++;
      payBack -=20;
    }
    while (payBack/10 >=1){
      bill10++;
      payBack -=10;
    }
    while (payBack/5 >= 1){
      bill5++;
      payBack-=5;
    }
    while (payBack/1 >=1){
      bill1++;
      payBack-=1;
    }
    while (payBack/.25 >=1){
      quarter++;
      payBack -=.25;
    }
    while (payBack/.10 >= 1){
      dime++;
      payBack-= .10;
    }
    while (payBack/.05 >=1){
      nickel++;
      payBack -=.05;
    }
    while (payBack < .05 && payBack >0){
      penny++;
      payBack -=.01;
    }

    System.out.println(bill20 + " " + bill10 + " " + bill5 + " " + bill1);
    System.out.println(quarter + " " + dime + " " + nickel + " " + penny);


  }
}
