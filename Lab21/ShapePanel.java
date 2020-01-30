/* Lucas Rodrigues Schiavetti
 * Lab 21 ShapePanel Class -- extends JPanel
 * September 2014
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel{
  
  private Shape[] shapes = new Shape[20];
  private DrawingPanel drawPanel = new DrawingPanel();
  private int count = 0;
  private JButton addShape = new JButton("Add Shape");
  private JLabel countLabel = new JLabel("Count: ");
  private JTextField showNum = new JTextField(2);
  
  
  
  /*MAIN*/
  public static void main (String args[]){
    JFrame frame = new JFrame();
    
    frame.add(new ShapePanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.setTitle("Lab 21");
  }//MAIN

  /*CONSTRUCTOR*/
  public ShapePanel(){
    JPanel controlPanel = new JPanel();
    
    ButtonListener bl = new ButtonListener();
    addShape.addActionListener(bl);
    
    controlPanel.setPreferredSize(new Dimension(100, 400));
    
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    add(controlPanel);
    add(drawPanel);
    
  }//SHAPE PANEL CONSTRUCTOR
  
  
  
  /*BUTTON LISTENER PRIVATE CLASS*/
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
      JButton jbteste = (JButton)e.getSource();
      if("Add Shape".equals(jbteste.getText())){
        if(count < (shapes.length)){
          shapes[count] = new Shape();
          count++;
        }
      }
      showNum.setText(Integer.toString(count));
      drawPanel.repaint();
    }
  }//BUTTON LISTENER CLASS
  
  /*DRAWING PANEL PRIVATE CLASS*/
  private class DrawingPanel extends JPanel{
    
    public DrawingPanel(){
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.pink);
    }
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0;i < count;i++){
      shapes[i].display(g);
      }
    }
  }//DRAWING PANEL CLASS
  
}//SHAPE PANEL CLASS