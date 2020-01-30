import javax.swing.*;
import java.awt.*;

public class Diner{
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int DIAMETER = 50;
  
  public Diner(int x, int y, String name, int seatNum, Color colour){
    this.x = x;
    this.y = y;
    this.name = name;
    this.seatNum = seatNum;
    this.colour = colour;
  }//end constructor
  
  public void draw(Graphics g){
    g.setColor(colour);
    g.fillOval(x , y, DIAMETER, DIAMETER);
    g.setColor(Color.black);
    g.drawString(name, x, y);
    g.drawString(Integer.toString(seatNum), x, y+10);
  }
  
  
  
}//end class



