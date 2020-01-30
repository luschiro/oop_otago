import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel{
  Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
  public TablePanel(){
  diner1 = new Diner (125 , 0 , "Murray", 1, Color.blue);
  diner2 = new Diner (175 , 75 , "Anne",   2, Color.red);
  diner3 = new Diner (175 , 150 , "Roger",  3, Color.blue);
  diner4 = new Diner (125 , 200, "Bella",  4, Color.red);
  diner5 = new Diner (75 , 150 , "Colin",  5, Color.blue);
  diner6 = new Diner (75 , 75 , "Josie",  6, Color.red);
  
 
  
  }
  
  public void paintComponent (Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    //g.fill
  }
  
}