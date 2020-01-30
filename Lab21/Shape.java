/* Lucas Rodrigues Schiavetti
 * Lab 21 Shape Class
 * September 2014
 */


import java.awt.*;
import java.util.*;

public class Shape{
  //private data fields
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  //Random object
  Random rnd = new Random();
  
  
  /*CONSTRUCTOR*/
  public Shape(){
    //set dimension
    width = rnd.nextInt((20)+10);
    height = width;
    //set position
    x = rnd.nextInt(400 - width);
    y = rnd.nextInt(400 - height);
    //set rgb color
    colour = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
  }//SHAPE CONSTRUCTOR
  
  
  /*SET RANDOM VALUES WITHIN A LIMIT*/
  public int randomRange (int lo, int hi){
    return rnd.nextInt((hi-lo)+lo);
  }//METHOD
  
  /*DISPLAY METHOD TO DRAW SHAPES*/
  public void display (Graphics g){
    g.setColor (colour);
    g.fillOval(x , y, width, height);
  }//DISPLAY()
  
  

}//SHAPE CLASS