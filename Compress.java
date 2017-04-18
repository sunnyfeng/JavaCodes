public class Compress{

  public static void main (String [] args){
    String n = IO.readString();
    IO.outputStringAnswer(compress(n));
  }

  public static String compress(String original){
    String str = original + "2";
    String answer = "";

    int counter = 0;
    int letter = 0;

    while(counter < str.length()-1){
      if (str.charAt(counter+1) == str.charAt(counter)){
        letter++;
      } else{
        if (letter > 0){
          answer += (letter+1) + str.substring(counter, counter+1);
        } else{
          answer += str.substring(counter, counter+1);
        }
        letter = 0;
      }

    counter++;
  }

  return answer;

}
}
