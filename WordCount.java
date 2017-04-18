public class WordCount{
  public static void main(String[] args){
    String s = IO.readString();
    int min = IO.readInt();
    if (min <= 0){
      IO.reportBadInput();
    } else {
    IO.outputIntAnswer(countWords(s, min));
    }
  }

  public static int countWords(String original, int minLength){
    //count number of words that meet or exceed minLength
    //separated by one or more spaces
    //ignore punctuation
    int answer = 0; //number of words past the minimum
    int letters = 0; //number of letteres of particular word
    int finalNum = 0; //is the end of the words

    for (int i = 0; i< original.length(); i++){

      // if there is a letter there
      if (original.charAt(i) != ' '){
        letters = countLetters(original, i, letters);
        //if this is the last run before exitting for loop
        if (i == original.length()-1){
          finalNum = letters;
        }
        //if there is a space and the number of letters is greater
      } else{
        //increase word count and set letters back to 0 to start new counting
        if (letters >= minLength){
        answer++;
        letters =0;
      } else {
        letters = 0;
      }
      }


    }

    //the last word after exitting the for loop
    if (finalNum >=minLength){
      return answer+1;
    } else {
      return answer;
    }
}

  public static int countLetters(String original, int i, int letters){
    if(original.charAt(i) >= 'a' && original.charAt(i) <= 'z'){
      letters++;
    }
    return letters;
}

}


//if(original.charAt(i) >= 'a' && original.charAt(i) <= 'z'){
//  letters++;
//}
