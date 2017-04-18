public class Palindrome{
  public static void main(String[] args){

    //first way - make backwards and compare
    String s = IO.readString();
    String reversed = "";
    for (int i = s.length()-1; i>=0; i--){
      reversed+=s.charAt(i);
    }
    if (reversed.equals(s)){
      System.out.println("Palindrome!");
    }


    //second way - compare letters from beginning to end
    for (int i = 0; i<s.length()/2; i++){
      char left = s.charAt(i);
      int j = s.length()-1-i;
      char right = s.charAt(j);
      if (left != right){
        return;
      }
    }
    System.out.println("Palindrome!");

  }
}
