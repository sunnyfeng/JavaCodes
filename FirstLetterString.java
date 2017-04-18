public class FirstLetterString{
  //capitalizes first word of every word in string sentences

  public static void main(String [] args){

    String n = IO.readString();
    System.out.println(convertFirstLetter(n));
  }

  public static String convertFirstLetter(String s){
    String rv = "";

    s = s+ " ";

    while (s.indexOf(" ") != -1){
      int x = s.indexOf(" ");
      String fw = s.substring(0,x);
      rv = rv + Character.toUpperCase(s.charAt(0)) + fw.substring(1) + " ";

      s = s.substring(x+1);

    }

    return rv.substring(0,rv.length()-1);   //take out that extra space at the end



  }
}
