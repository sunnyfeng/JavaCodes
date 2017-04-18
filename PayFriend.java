public class PayFriend{
  public static void main (String [] args){

    System.out.println("Enter payment amount: ");
    double pay = IO.readDouble();
    double fee = 0;

    //error check
    if (pay <=0){
      IO.reportBadInput();
      return;

    } else if (pay <= 100 && pay > 0){
      fee = 5; //flat rate
      IO.outputDoubleAnswer(fee);

    } else if (pay >100 && pay <1000){

        //determine fee
        if (.03*pay >6){
          fee = .03*pay;
        } else {
          fee = 6;
        }
        IO.outputDoubleAnswer(fee);

    } else if (pay >=1000 && pay <10000){

        //determine fee
        if (.01*pay >15){
          fee = .01*pay;
        } else {
          fee = 15;
        }
        IO.outputDoubleAnswer(fee);

    } else if (pay >= 10000){

        double pay10000 = pay-10000;
        double fee1 = 100;

        if (pay10000 <= 5000 && pay10000 >0){
          fee = fee1 + (pay10000)*.02;

        } else if (pay10000>=5000){
          double payRemain = pay10000-5000;
          fee = fee1 + 100 +(payRemain)*(.03);

        } else if (pay10000==0){
          fee = fee1;
        }

        IO.outputDoubleAnswer(fee);

    }


  }
}
