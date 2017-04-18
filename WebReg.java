public class Webreg{
  public static void main (String[] args){

    Student s1 = new Student("Bob", "1234");
    Student s1 = new Student("Sally", "5678");
    Course c1 = new Course("CS111", "198:111", 1000, 3);
    Course c2 = new Course("CS112", "198:112", 600, 4);

    `//add Bob`to CS111
    s1.addCourse(c1);
    c.addStudent(s1);

    System.out.println(s1.toString());

  }


}
