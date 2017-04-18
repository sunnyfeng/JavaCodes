public class Exam2{
  public static void main(String[] args){
  /*  int[][] arr = new int[4][5];


    for (int i = 0; i < arr.length; i++){
      for (int j = 0; j< arr[i].length; j++){
        arr[i][j] = i;
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }


    String code = IO.readString();
    System.out.println(decode(code));

    //print array
    String[] titles = {"Hamlet", "The Great Gatsby", "Great Expectations"};
    for (int i =0; i < titles.length;i++){
      System.out.println(titles[i]);
    }

*/

  int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
  for (int i = 0; i < arr.length; i++){
    for (int j = 0; j< arr[i].length; j++){
      System.out.println(arr[i][j]);
    }

  }

}

  public static String decode(String code){
      code = code.toLowerCase();
      String decoded = "";
      for (int i = 0; i < code.length(); i++){
        if (code.charAt(i) >= 'a' && code.charAt(i) <= 'z'){
          if (code.charAt(i) > 'a'){
            decoded += Character.toString((char)(code.charAt(i)-1));
          } else {
            decoded += Character.toString('z');
          }
        } else if (code.charAt(i) >= '0' && code.charAt(i) <= '9'){
            if (code.charAt(i) > '0'){
              decoded += Character.toString((char)(code.charAt(i)-1));
            } else {
              decoded += Character.toString('9');
            }
        } else {
          decoded += Character.toString(code.charAt(i));
        }

      }

      return decoded;

  }

  public static String reverseWords(String sentence){
    return "";
    }
  }
