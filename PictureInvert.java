public class PictureInvert{
  public static void main(String[] args){
    /*  NOTES
        load image with the picture class
        image = matrix - has rows and columns
        .getWidth()   .getHeight()

        Pixel class has:
          .getRed() -- return int between 0 and 255
          .getBlue()
          .getGreen()
          .setRed(int i)
          .setBlue(int i)
          .setGreen(int i)
  */
  //pixels already part of picture class, no need to say new Pixel

    Picture img = new Picture("/Users/sunnyfeng/Documents/JavaCodes/RGB.png");
    //Picture img = new Picture("icon.png");
    //Picture img = new Picture("RedPanda.jpeg"); //just need name if in the same folder

    //instructions
    System.out.println("To invert: 'invert'");
    System.out.println("To make black vertical lines: 'black'");
    System.out.println("To switch red and blue: 'switch'");
    System.out.println("To count red pixels: 'red'");
    System.out.println("To flip over vertical: 'flip1'");
    System.out.println("To flip over horizontal: 'flip2'");
    System.out.println("To flip over diagonal: 'flip3'");
    String n = IO.readString();
    if (n.equals("invert")) invertPicture(img);
    if (n.equals("black")) makeVertBlack(img);
    if (n.equals("switch")) switchRedBlue(img);
    if (n.equals("red")) System.out.println(countRedPixels(img));
    if (n.equals("flip1")) flipVertical(img);
    if (n.equals("flip2")) flipHorizontal(img);
    if (n.equals("flip3")) flipDiagonal(img);
  }

  public static void invertPicture(Picture img){
    for (int x = 0; x < img.getWidth(); x++){
      for (int y = 0; y < img.getHeight(); y++){
        Pixel p = img.getPixel(x,y);
          p.setGreen(255- p.getGreen()); //set pixel to inverse method
          p.setRed(255- p.getRed()); //set pixel to inverse method
          p.setBlue(255- p.getBlue()); //set pixel to inverse method
        }
      }

    img.show();

  }

  public static void makeVertBlack(Picture img){
    for (int x = 0; x < img.getWidth(); x++){
      for (int y = 0; y < img.getHeight(); y++){
        if (x%2 ==0 || x%3 == 0){
          Pixel p = img.getPixel(x,y);
          p.setGreen(0); //set pixel to inverse method
          p.setRed(0); //set pixel to inverse method
          p.setBlue(0); //set pixel to inverse method
        }
      }
    }

    img.show();

  }

//switch pure blue and pure red pixels
  public static void switchRedBlue(Picture img){
    for (int x = 0; x < img.getWidth(); x++){
      for (int y = 0; y < img.getHeight(); y++){
        Pixel p = img.getPixel(x,y);
          //pure red
          if (p.getGreen() == 0 && p.getBlue() == 0 && p.getRed() == 255){
            p.setBlue(255);
            p.setRed(0);
          //pure blue = only blue
        } else if (p.getGreen() == 0 && p.getRed() == 0 && p.getBlue() == 255){
              p.setRed(255);
              p.setBlue(0);
          }
      }
    }

    img.show();


  }

  //count red pixels - pure red
    public static int countRedPixels(Picture img){
      int counter = 0;
      for (int x = 0; x < img.getWidth(); x++){
        for (int y = 0; y < img.getHeight(); y++){
          Pixel p = img.getPixel(x,y);
            //if red and nothing else, add to counter
            if (p.getGreen() == 0 && p.getBlue() == 0 && p.getRed() == 255){
              counter++;
            }
        }
      }

      return counter;

    }

    //reflect left half and reflect over line in middle
    public static void flipVertical(Picture img){
      for (int x = 0; x < img.getWidth()/2; x++){
        for (int y = 0; y < img.getHeight(); y++){
          Pixel p = img.getPixel(x,y);
          Pixel pNew = img.getPixel((img.getWidth()-1-x), y);
          pNew.setBlue(p.getBlue());
          pNew.setRed(p.getRed());
          pNew.setGreen(p.getGreen());
        }
      }

      img.show();


    }

    //reflects top half and reflect over middle horizontal line
    public static void flipHorizontal(Picture img){
        for (int x = 0; x < img.getWidth(); x++){
          for (int y = 0; y < img.getHeight()/2; y++){
            Pixel p = img.getPixel(x,y);
            Pixel pNew = img.getPixel(x, (img.getWidth()-1-y));
            pNew.setBlue(p.getBlue());
            pNew.setRed(p.getRed());
            pNew.setGreen(p.getGreen());
          }
        }

      img.show();


    }

    // flip over / line
    //assume square
    public static void flipDiagonal(Picture img){
      if (img.getWidth() != img.getHeight()){
        System.out.println("Image not Square");
        return;
      } else {
          double length = img.getWidth();
          for (int x = 0; x < length; x++){
              for (int y = 0; y < length-1-x; y++){
                  Pixel p = img.getPixel(x,y);
                  //Pixel pNew = img.getPixel((img.getWidth()-1-x), (img.getWidth()-1-y));
                  Pixel pNew = img.getPixel((img.getWidth()-1-y),(img.getWidth()-1-x));
                  pNew.setBlue(p.getBlue());
                  pNew.setRed(p.getRed());
                  pNew.setGreen(p.getGreen());
              }
          }

          img.show();
      }

    }



}
