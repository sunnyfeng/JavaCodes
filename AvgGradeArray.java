public class AvgGradeArray{
  public static void main (String[] args){
    //rows = students, columns = assignment number

    int[][] arr = {
      {80, 65,77,90},
      {100,30,44,87},
      {97,98,90,99},
      {35,40,60,90},
      {70,75,88,98}
    };

    //average of each row
    int sum = 0;
    double avg = 0;
    for (int j = 0; j < arr.length; j++){
      for (int i = 0; i < arr[0].length; i++){
        sum+= arr[j][i];
      }
      avg = (double)sum/arr[0].length;
      System.out.println(avg);
      sum = 0;
      avg = 0;
    }

    //average of the columns
      for (int j = 0; j < arr[0].length; j++){
        for (int i = 0; i < arr.length; i++){
          sum+= arr[i][j];
        }
        avg = (double)sum/arr.length;
        System.out.println(avg);
        sum = 0;
        avg = 0;
      }


  }
}
