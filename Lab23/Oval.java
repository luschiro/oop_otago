/* Lucas Rodrigues Schiavetti
 * Lab 23 Oval Class -- extends Shape
 * October 2014
 */

package shapes;

import java.awt.*;

public class Oval extends Shape{
  //
  
  public Oval(){
    y = rnd.nextInt(400 - (4*width));
    height = 4*width;
  }
  
  /*DISPLAY METHOD TO DRAW SHAPES*/
  public void display (Graphics g){
    g.setColor (colour);
    g.fillOval(x , y, width, height);
  }//DISPLAY()
  
  
  
}//CIRCLE CLASS