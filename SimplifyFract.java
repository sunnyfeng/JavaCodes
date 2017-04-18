public class SimplifyFract{
  public static void main(String[] args){
    
    int num1 = IO.readInt();
    int num2 = IO.readInt();

    int greatestFact = Methods.gcf(num1,num2);

    int top = num1/greatestFact;
    int bottom = num2/greatestFact;

    System.out.println((double)top/bottom);

  }
}
