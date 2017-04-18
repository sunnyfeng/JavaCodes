public class WordCountTry3{

  public static void main(String[] args){
    String s = IO.readString();
    int min = IO.readInt();
    if (min <0){
      IO.reportBadInput();
    }

    IO.outputIntAnswer(countWords(s, min));
  }

  public static int countWords(String original, int minLength){
    String str = original;
    int counter = 0;
    int letterCount = 0;
    int wordCount = 0;

  //  for (int i = 0; i < str.length(); i++){
  while(counter < str.length()){

    while (str.charAt(counter) != ' '){
      if (str.charAt(counter) >= 'a' && str.charAt(counter) <= 'z'){
        letterCount++;
      }
    }
    if (letterCount>= minLength){
      //System.out.println(letterCount);
      wordCount++;
    }
    letterCount = 0;

    counter++;
  }

  return wordCount;
  }

}
