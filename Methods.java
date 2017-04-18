public class Methods{

  public static int gcf(int fact1, int fact2){

    for (int n = fact2; n>0; n--){
      if(fact1%n ==0){
        if (fact2%n ==0){
          return n;

        }
      }
    }

    return 1;

  }
}
