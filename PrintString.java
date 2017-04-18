public class PrintString{
  public static void main(String[] args){
    //print out each character of a String

    String input = IO.readString();
    printString(input);

  }

  public static void printString(String s){
    if (s==null){
      return;
    }
    int l = s.length();

    for (int i = 0; i < l; i++){
      char c = s.charAt(i);
      System.out.println(c);
    }


  }
}
