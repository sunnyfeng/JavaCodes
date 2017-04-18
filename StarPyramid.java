public class StarPyramid{
  public static void main (String [] args){
    System.out.print("Enter height: ");
    int h = IO.readInt();

    for (int i = 0; i<h; i++){
      for (int j=0; j<i; j++){
        System.out.print("*");
      }
        System.out.println("*");
    }


  }
}
