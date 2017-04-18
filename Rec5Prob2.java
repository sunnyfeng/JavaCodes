public class Rec5Prob2{
  public static void main (String [] args){
    System.out.print("Enter height: ");
    int h = IO.readInt();

    //first half
    for (int i = 0; i<h; i++){
      for (int j=0; j<=i; j++){
        System.out.print("*");
      }
        System.out.println();
    }

    //second half
    for (int i = h-1; i>0; i--){
      for (int j=0; j<i; j++){
        System.out.print("*");
      }
        System.out.println();
    }

  }
}
