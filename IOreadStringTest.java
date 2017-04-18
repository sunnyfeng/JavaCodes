public class IOreadStringTest{
  public static void main (String[] args){

    System.out.println("enter first color: ");
    String color = IO.readString();
    int colorValue1 = 0;
    int colorValue2 = 0;
    int total = 0;

    System.out.println(color);

    if (color.equals("yes")){
      colorValue1 = 3;
      System.out.println("It worked!");
      colorValue2 = 4;
    }

    total = colorValue1+colorValue2;
    
    System.out.println(total);


  }
}
