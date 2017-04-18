public class Gradebook2D{
  public static void main(String[] args){
    String[] roster = {"bob", "sally", "alice", "john", "amy", "andrew", "oliver"};
    double [][] grades = new double [7][10];
                                //row   //entries in each row
    System.out.println("Student?");
    String stu = IO.readString();
    System.out.println("Test number? (0 as first)");
    int testNum = IO.readInt();
    System.out.println("new grade?");
    double newGrade = IO.readDouble();

    //updateGrade(grades,roster,stu,testNum,newGrade);
    //updateGrade2(grades,roster,stu,testNum,newGrade);
    //System.out.println(calculateStudentAvg(stu,roster,grades));
    System.out.println(calculateClassAverage(grades));
  }

  //updates a student's grades
  public static void updateGrade(double[][] grades, String[] roster, String student, int testNum, double newGrade){
    int rowNum = -1;
    for (int i = 0; i < roster.length; i++){
      if (student.equals(roster[i])){
        rowNum = i;
        break;
      }
    }

    if (rowNum == -1){
      System.out.println("Student does not exist!");
      return;
    } else if (testNum > grades[rowNum].length-1 || testNum < 0){
      System.out.println("Assignment number does not exist!");
      return;
    } else {
      grades[rowNum][testNum] = newGrade;
      System.out.println("The student " + roster[rowNum] + "'s assignment " + testNum + " is now changed to " + newGrade);
    }

  }

  public static void updateGrade2(double[][]grades,String[] roster, String student, int testNum, double newGrade){
      int rowNum = findStudent(student,roster);
      if (rowNum != -1){
        grades[rowNum][testNum] = newGrade;
        System.out.println("The student " + roster[rowNum] + "'s assignment " + testNum + " is now changed to " + newGrade);
      } else {
        System.out.println("Something went wrong!");
      }

  }

  public static int findStudent(String name, String[] roster){
    int i;
    int answer = -1;
    for (i = 0; i <roster.length; i++){
      if (roster[i].equals(name)){
        answer = i;
      }
    }
    return answer;

  }

  public static double calculateStudentAvg(String name, String[] r, double[][] grade){
    int rowNum = findStudent(name,r);
    double sum = 0;
    for (int i = 0; i < grade[rowNum].length; i++){
      sum+= grade[rowNum][i];
    }
    double average = sum/grade[rowNum].length;
    return average;

  }

  public static double calculateAssignmentAverage(int assNum, double[][] grade){
    double sum = 0;
    for (int i = 0; i < grade.length; i++){
      sum+= grade[i][assNum];
    }
    double average = sum/grade.length;
    return average;

  }

  public static double calculateClassAverage(double[][] grade){
    //use nested loop

    double sum = 0;
    for (int i = 0; i < grade.length; i++){
      for (int j = 0; j < grade[i].length;j++){
        sum += grade[i][j];
      }
    }
    int numOfGrades = grade.length * grade[0].length;
    double average = sum/numOfGrades;
    return average;

  }


}
