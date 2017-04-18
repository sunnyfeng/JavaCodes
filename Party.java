public class Party{
  public static void main (String [] args){
    int numPeople = IO.readInt();
    int slicesPerPerson = IO.readInt();
    int sodaPerPerson = IO.readInt();
    double costOfPie = IO.readDouble();
    int slicesPerPie = IO.readInt();
    double costOfSoda = IO.readDouble();
    int cansPerCase = IO.readInt();

    //cost of pizza
    int totalSlices = numPeople*slicesPerPerson;
    double totalPizzaCost = (totalSlices/slicesPerPie+1)*costOfPie;

    //cost of soda
    int totalSoda = numPeople*sodaPerPerson;
    double totalSodaCost = (totalSoda/cansPerCase+1)*costOfSoda;

    double total = totalPizzaCost + totalSodaCost;

    IO.outputDoubleAnswer(total);

  }
}
