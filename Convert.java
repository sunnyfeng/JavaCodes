public class Convert{
  public static void main(String[] args){
    System.out.print("string: ");
    String n = IO.readString();

    //error checking - must be 0's and 1's
    for (int i = 0; i<n.length(); i++){
      if (n.charAt(i) != '0' && n.charAt(i) != '1'){
        IO.reportBadInput();
        return;
      }
    }
    System.out.print("boolean: ");
    boolean m = IO.readBoolean();

    IO.outputIntAnswer(convert(n,m));
  }

  public static int convert(String binaryString, boolean signBit){
    String bs = binaryString;
    String bsSign = "";
    int answer = 0;

    //signed integer
    if (signBit == true){
      String sign = bs.substring(0,1);
      //take off signed digit
      bsSign = bs.substring(1,bs.length());

      //convert string boolean to number
      for (int i = 0; i < bsSign.length(); i++){
        if (bsSign.charAt(i) == '1'){
          answer += Math.pow(2,bsSign.length()-1-i);
        }
      }

      //if positive
      if (sign.equals("0")){
        return answer;
      //if negative
      } else{
        return answer*-1;
      }
    //unsigned integer
    } else{

      for (int i = 0; i < bs.length(); i++){
        if (bs.charAt(i) == '1'){
          answer += Math.pow(2,bs.length()-1-i);
        }
      }
      return answer;
  }

}

}
