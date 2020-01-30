import javax.swing.*;

public class DinerApp extends JFrame{
  public static void main(String args[]){
    DinerApp frame = new DinerApp();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    
    TablePanel tb = new TablePanel();
    frame.add(tb);
    
    frame.pack();
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}