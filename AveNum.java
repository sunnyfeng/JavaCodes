public class AveNum{
  public static void main (String[] args){
    int n = IO.readInt();
    int count = 0;
    int total = 0;
    do{
      total+= IO.readInt();
      count++;
    }while (count<n);
    double average = (double)total/n;
    System.out.print(average);

  }
}
