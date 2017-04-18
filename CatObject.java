public class CatObject{
  public String name;
  private int age;
  public char gender;
  public String color;
  private double weight;

  //nonstatic because instance method
  public void setAge(int newAge){
    if (newAge >= 0){
      age = newAge;
    }
  }

  //get private age for use
  public int getAge(){
    return age;
  }

  //eating
  public void eat(String food){
    
  }

}
