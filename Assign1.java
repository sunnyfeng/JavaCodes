//resistors math

public class Assign1{
  public static void main (String[] args){

    System.out.println("1st band color: ");
    String bandColor1 = IO.readString();
    System.out.println(bandColor1);

    System.out.println("2nd band color: ");
    String bandColor2 = IO.readString();
    System.out.println(bandColor2);

    System.out.println("3rd band color: ");
    String bandColor3 = IO.readString();
    System.out.println(bandColor3);

    int bandValue1 = 0;
    int bandValue2 = 0;
    int bandValue3 = 0;
    int totalValue = 0;

    if (bandColor1.equals("black")){
      bandValue1 = 0;
    } else if (bandColor1.equals("brown")){
      bandValue1 = 1;
    } else if (bandColor1.equals("red")){
      bandValue1 = 2;
    } else if (bandColor1.equals("orange")){
      bandValue1 = 3;
    } else if (bandColor1.equals("yellow")){
      bandValue1 = 4;
    } else if (bandColor1.equals("green")){
      bandValue1 = 5;
    } else{
      System.out.println("Entry not valid. Try again.");
      return;
    }


    if (bandColor2.equals("black")){
      bandValue2 = 0;
    } else if (bandColor2.equals("brown")){
      bandValue2 = 1;
    } else if (bandColor2.equals("red")){
      bandValue2 = 2;
    } else if (bandColor2.equals("orange")){
      bandValue2 = 3;
    } else if (bandColor2.equals("yellow")){
      bandValue2 = 4;
    } else if (bandColor2.equals("green")){
      bandValue2 = 5;
    } else{
      System.out.println("Entry not valid. Try again.");
      return;
    }

    if (bandColor3.equals("black")){
      bandValue3 = 1;
    } else if (bandColor3.equals("brown")){
      bandValue3 = 10;
    } else if (bandColor3.equals("red")){
      bandValue3 = 100;
    } else if (bandColor3.equals("orange")){
      bandValue3 = 1000;
    } else if (bandColor3.equals("yellow")){
      bandValue3 = 10000;
    } else if (bandColor3.equals("green")){
      bandValue3 = 100000;
    } else{
      System.out.println("Entry not valid. Try again.");
      return;
    }

    totalValue = (bandValue1*10 + bandValue2)*bandValue3;

    System.out.println("The total value is: " + totalValue);





  }
}
