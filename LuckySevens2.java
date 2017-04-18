public class LuckySevens2{
  public static void main(String [] args){

    System.out.println("Enter the range (integers): ");
    int start = IO.readInt();
    System.out.println("to");
    int end = IO.readInt();
    if (end < start){
      IO.reportBadInput();
      return;
    }
    int digits = 1;
    int i = 10;
    while ((end-start)/i >0){
      digits++;
      i*=10;
    }

    int sum = digits*(end-start)/10;
    System.out.println(sum);
  }}
