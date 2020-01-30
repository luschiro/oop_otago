/* Lucas Rodrigues Schiavetti
 * Lab 23 Square Class -- extends Shape
 * October 2014
 */

package shapes;

import java.awt.*;

public class Square extends Shape{
  
  
  /*DISPLAY METHOD TO DRAW SHAPES*/
  public void display (Graphics g){
    g.setColor (colour);
    g.fillRect(x , y, width, height);
  }//DISPLAY()
  
  
  
}//SQUARE CLASS