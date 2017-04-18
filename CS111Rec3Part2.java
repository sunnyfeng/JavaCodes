//Using Picasso drawing class
//drawing shape

public class CS111Rec3Part2{
  public static void main( String[] args){

    //center and draw head
    Picasso.moveRight(7);
    Picasso.moveDown(7);
    Picasso.drawCircle(10);

    //draw eyes
    Picasso.moveUp(2);
    Picasso.moveLeft(2);
    Picasso.drawCircle(1);
    Picasso.moveRight(4);
    Picasso.drawCircle(1);

    //draw mouth
    Picasso.moveDown(4);
    Picasso.moveLeft(5);
    Picasso.drawLineRight(6);


  }
}
