public class StringTest{

  public static void main(String[] args){

    /* //alphabet lowercase
      for(int i = 'a'; i <= 'z'; i++){
        System.out.print((char)i);
      }
      System.out.println();
      */

      String s = IO.readString();
      String t = IO.readString();

      if (s.equals(t)){
        System.out.println("hello");
      } else {
        System.out.println("bye");
      }

  }
}
