public class WordCountTry1{
  public static void main(String[] args){
    String s = IO.readString();
    int minLength = IO.readInt();
    System.out.println(countWords(s, minLength));
  }

  public static int countWords(String original, int minLength){
    //count number of words that meet or exceed minLength
    //separated by one or more spaces
    //ignore punctuation
    int answer = 0;
    String word= "";
    if (original.charAt(original.length()-1) != ' '){
      original = original + ' ';
    }
    //while (original.charAt(0) != ' '){
  //  }

    //for (int i = 0; i< original.length(); i++){

    for (int i = 0; i< original.length(); i++){

      word = original.substring(0, original.indexOf(' '));

      if (countLetters(word) >= minLength){
        answer++;
      }

      if (word.length() == 0){
        break;
      } else{
        original = original.substring(original.indexOf(' ')+1, original.length());
      }
    }

    return answer;
}

  public static int countLetters(String word){
    int counter = 0;
    while (word.charAt(counter) != ' ' && counter < word.length()-1){
      counter++;
    }
    return counter + 1;
  }
}
