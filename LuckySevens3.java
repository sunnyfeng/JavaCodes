public class LuckySevens3{
  public static void main(String[] args){

        int n = IO.readInt(); //from 0 to n
        int k = 7; //find number of this
        int originalNumber = n;
        int power = 1;
        int i = 0;
        int counter = 0;

        while (n > 0){
            int d = n % 10;
            n /= 10;

            counter += d * (power * i) / 10;

            if (d > k)
                counter += power;
            else if (d == k)
                counter += originalNumber % power + 1;

            power *= 10;
            i++;
        }

        System.out.println(counter);

    }
}
