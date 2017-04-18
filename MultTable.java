public class MultTable{
  public static void main (String [] args){
    int n = IO.readInt();

    //error check
    while (n<1){
      System.out.println("Error. Must be 1 or greater.");
      n = IO.readInt();
    }

    for (int i = 1; i <= n; i++ ){
      //row numbers
      for (int j = 1; j <=n; j ++){
        //column numbers
        //multiply together to get mult table
        System.out.print(i*j + "\t");
      }
      //make next line
      System.out.println();

    }
  }
}
