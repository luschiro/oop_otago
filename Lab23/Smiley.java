/* Lucas Rodrigues Schiavetti
 * Lab 23 Smiley Class -- extends Shape
 * October 2014
 */

package shapes;

import java.awt.*;

public class Smiley extends Shape{
  
   public Smiley(){
    height = 30;
    width = 30;
    y = rnd.nextInt(400 - height);
    x = rnd.nextInt(400 - width);
    
    
  }
  
  
  /*DISPLAY METHOD TO DRAW SHAPES*/
  public void display (Graphics g){
    g.setColor (colour);
    g.fillOval(x , y, height, width);
    g.setColor(Color.black);
    g.fillOval(x+7, y+8, 4, 4);
    g.fillOval(x+20, y+8, 4, 4);
    g.drawArc(x+8, y+10, 15, 13, 190, 160);
  }//DISPLAY()
  
  
  
}//SMILEY CLASS