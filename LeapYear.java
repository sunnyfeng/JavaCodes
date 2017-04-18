public class LeapYear{
  public static void main(String[] args){
    int n = IO.readInt();
    boolean leap = true;
    if (n%400 == 0){
      leap = true;
    } else if (n%100 ==0){
      leap = false;
    } else if (n%4 == 0){
      leap = true;
    } else{
      leap = false;
    }

    System.out.println(leap);
  }
}
