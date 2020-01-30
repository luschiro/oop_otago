/* Lucas Rodrigues Schiavetti
 * Lab 23 Circle Class -- extends Shape
 * October 2014
 */

package shapes;

import java.awt.*;

public class Circle extends Shape{
  
  
  /*DISPLAY METHOD TO DRAW SHAPES*/
  public void display (Graphics g){
    g.setColor (colour);
    g.fillOval(x , y, width, height);
  }//DISPLAY()
  
  
  
}//CIRCLE CLASS