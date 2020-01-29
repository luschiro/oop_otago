/*Box class
 * Lucas Rodrigues Schiavetti July 2014
 */

import java.lang.String; //import String class

public class Box{

  private int height;
  private int width;
  private int length;//data fields
  
  public void setHeight(int h){
    height = h;
  }//height mutator method

   public void setLength(int l){
    length = l;
   }//length mutator method
   
  public void setWidth(int w){
    width = w;
  }//width mutator method
  
  public int getSurfaceArea(){
    return  2*(height*width + height*length + width*length);
  }//Area accessor method
  
  public int getVolume(){
    return height*width*length;
  }//Volume accessor method
  
  public String toString(){
    return "Height is: "+ height + ", Length is: "+ length + ", Width is: " + width + ", Volume is: " +getVolume() + ", Surface Area is: " +getSurfaceArea();
  }//method that returns the String describing the box
  
  public Box(int hc, int lc, int wc){
    height = hc;
    length = lc;
    width = wc;
  }//new constructor method
  
  public Box(){}//default constructor method equivalent
  
  public Box(int cube){
    height = cube;
    length = cube;
    width = cube;
  }//constructor for cubes
  
  
}//end class