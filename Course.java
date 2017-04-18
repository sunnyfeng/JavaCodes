public class Course{
  private String name;
  private double id;
  private double credits;
  Student[] roster;

  private int capacity;

  String day;
  int hour_start;
  int hour_end;

  public Course(String name, String id, int cap, double credits){
    capacity = cap;
    this.name = name;
    this,id = id;
    this.credits = credits;
    hour_start = 5;
    hour_end = 8;
    day = "Friday";
  }

  public double getCredits(){
    return this.credits;
  }

  public boolean register(Student s){
    //assign this course to the first open empty array
    for(int i = 0; i < roster.length; i++){
      if (roster[i] == null){
        roster[i] = s;
        return true;
      }
    }
    return false;
  }

  //non static because on each different course
  public boolean equals(Course c){
    //two courses - this course and course c
    return this.name.equals(c.name); //&& this.credits == c.credits && this.day.equals(c.day);
  }

  //check if overlaps
  public boolean overlaps(Course c){
    //not the same day == no overlap
    if (!day.equals(c.day)){
        return false;
    } else{
      if (this.hour_start <= c.hour_end && this.hour_start > = c.hour_start){
        return true;
      }
      if(c.hour_start <= hour_end && c.hour_start > = this.hour_start){
        return true;
      }
    }

  }

  //to allow printing
  public String toString(){
    return name + " " + id;

  }



}
