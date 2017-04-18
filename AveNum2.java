public class AveNum2{
  public static void main (String[] args){
    int n = IO.readInt();
    int sum = 0;
    
    for (int i =0 ; i < n; i++){
      sum += IO.readInt();
    }
    System.out.println((double)sum/n);
  }
}
