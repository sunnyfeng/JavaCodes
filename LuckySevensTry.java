public class LuckySevens{
  public static void main(String [] args){

    //still haven't gotten the 70's to work

    System.out.println("Enter the range (integers): ");
    int start = IO.readInt();
    System.out.println("to");
    int end = IO.readInt();
    if (end < start){
      IO.reportBadInput();
      return;
    }
    int sum = 0;

    int i = start;
    int j = 10;


//this works for most low numbers but cannot do, 77 and can't do 700 and above
    while(j<1000000000){

      while (Math.abs(i/j) >= 0 && i<=end){

        if (Math.abs(i) == 7){
          sum++;
        } else if (Math.abs(i%j) == 7){
          sum++;
        }

        if (Math.abs(i/7) == j){  //|| Math.abs(i%7) == 0
          sum++;
          if (Math.abs(i%10)==7){
            sum++;
          }
        }


        i++;
      }

      j= j*10;

    }



/*
  for (int i = start; i<= end; i++){
    for (int j = 10; j<1000000000; j*=10){
      //single digit 7
      if (Math.abs(i)==7){
        sum++;
      }
      //if j < i only, run this
      if (Math.abs(i/j) >= 0){

        //ones place
        if (Math.abs(i%j) == 7){
          sum++;
        }
        //if other places
        if (Math.abs(i/7) == j){
          sum++;
        }
      }

  }
}
*/


  System.out.println(sum);

}
}
