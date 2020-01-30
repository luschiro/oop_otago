/* Lucas Rodrigues Schiavetti
 * Lab 23 Shape Class
 * October 2014
 */

package shapes;

import java.awt.*;
import java.util.*;

public abstract class Shape{
  //data fields
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color colour;
  protected int moveX = 1;
  protected int moveY = 1;
  
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
  
  /*DISPLAY ABSTRACT METHOD*/
  public abstract void display (Graphics g);
  
  /*MOVE METHOD*/
  public void move(){
      x += moveX;
      y += moveY;
      
      /*CHANGE DIRECTIONS IN BORDERS OF PANEL*/
      if(x == 0 || x == (400-width)){
        colour = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
        moveX = -moveX;
      }
      if(y == 0 || y == (400-height)){
        colour = new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255));
        moveY = -moveY;
      }
      
      /*SHAPES > 15 - VERTICAL MOVEMENT ONLY*/
//    if(width > 15){
//      moveX = 0;
//    }
    
    
  }//end of move


}//SHAPE CLASS