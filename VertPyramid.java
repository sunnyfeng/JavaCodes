public class VertPyramid{
  public static void main (String [] args){
    System.out.print("Enter height: ");
    int h = IO.readInt();

    //first half
    for (int i = 0; i<h; i++){

      for (int j=i; j<h; j++){
        System.out.print(" "); //h-1 spaces
      }
      for (int k=0; k<=i;k++){
        System.out.print("*");
      }
        System.out.println();
    }

    for (int i = 0; i<h; i++){

      for (int j=h-1; j<i; j++){
        System.out.print(" "); //h-1 spaces
      }
      for (int k=i; k>=0;k--){
        System.out.print("*");
      }
        System.out.println();
    }



  }}
