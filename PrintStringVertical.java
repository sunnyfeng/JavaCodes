public class PrintStringVertical{
  public static void main(String[] args){
    String s = IO.readString();
    printVertical(s);
    printVerticalUpper(s);
    printVerticalAlt(s);

  }

  public static void printVertical(String s){
    for (int i = 0; i< s.length(); i ++){
      System.out.println(s.charAt(i));
    }
  }

  public static void printVerticalUpper(String s){
    for (int i = 0; i< s.length(); i ++){
      System.out.println(Character.toUpperCase(s.charAt(i)));
    }
  }

  public static void printVerticalAlt(String s){
    for (int i = 0; i< s.length(); i ++){
      if (i%2==0){
      System.out.println(Character.toUpperCase(s.charAt(i)));
    } else {
      System.out.println(s.charAt(i));
    }
    }
  }


}
