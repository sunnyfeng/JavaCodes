public class CellBill{
  public static void main (String[] args){
    double monthlyFee = IO.readDouble();
    double ratePerMin = IO.readDouble();

    int freeMin = IO.readInt();
    int howManyMin = IO.readInt();
    double charge = 0;

    if (howManyMin > freeMin){
    charge = monthlyFee+ ratePerMin*(howManyMin-freeMin);
  } else{
    charge = monthlyFee;
  }

  System.out.println(charge);
  }
}
