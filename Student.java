public class Student{

  private String name;
  private String id;
  private double numcredits;

  Course[] schedule;

  //constructor
  public Student(Student name, String id){
    numcredits = 0;
    this.name = name; // this = instance, in the parameter
    this.id = id;
    this.schedule = new Course[20];
  }

  //let user see number of credits of student
  public double getNumCredits(){
    return this.numcredits;
  }

  //add course and return whether it worked or not
  public boolean addCourse(Course c){
    //assign this course to the first open empty array
    for(int i = 0; i < schedule.length; i++){
      if (schedule[i] == null){
        schedule[i] = c;
        numcredits += c.getCredits();
        return true;
      } else if (schedule[i].equals(c) || schedule[i].overlaps(c)){
        System.out.println("Class already added or overlap");
        return false;
      }
    }
    return false;
  }

  //to allow printing
  public String toString(){
    return name + " " + id + " " + numcredits + schedule[0].toString();

  }



}
