public class PigLatin{
  public static void main(String[] args){
    String s = IO.readString();
    System.out.println(translate(s));
  }

  public static String translate (String original){
    original = original.toLowerCase();
    char first = original.charAt(0);
    String newString = "";
    //if begins with consonant, add consonant to end + "ay"
    if (first != 'a' && first != 'e' && first != 'i' && first != 'o' && first != 'u'){
        newString = original.substring(1,original.length()) + first + "ay";
      }
    //if begins with vowel, just add "way" to the end
    else {
      newString = original + "way";

    }

     return newString;
  }

}
