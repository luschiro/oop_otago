/* Lucas Rodrigues Schiavetti
 * Lab 23 ShapePanel Class -- extends JPanel
 * October 2014
 */

package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel{
  
  //data fields
  private Shape[] shapes = new Shape[20];
  private DrawingPanel drawPanel = new DrawingPanel();
  private int count = 0;
  private JLabel countLabel = new JLabel("Count: ");
  private JTextField showNum = new JTextField(2);
  private JButton[] jbuttons = new JButton[7];
 
  Timer timer;
  private final int DELAY = 10;
  
  
  /*MAIN*/
  public static void main (String args[]){
    JFrame frame = new JFrame();
    frame.add(new ShapePanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.setTitle("Lab 23");
  }//MAIN
  
  /*CONSTRUCTOR*/
  public ShapePanel(){
    JPanel controlPanel = new JPanel();
    
    ButtonListener bl = new ButtonListener();
    jbuttons[0] = new JButton("Circle");
    jbuttons[1] = new JButton("Square");
    jbuttons[2] = new JButton("Oval");
    jbuttons[3] = new JButton("Smiley");
    jbuttons[4] = new JButton("Swirl");
    jbuttons[5] = new JButton("Start");
    jbuttons[6] = new JButton("Stop");
    for(JButton botao : jbuttons){
      botao.addActionListener(bl);
      controlPanel.add(botao);
    }//foreach
    
    controlPanel.setPreferredSize(new Dimension(100, 400));
    
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    add(controlPanel);
    add(drawPanel);
    
    timer = new Timer(DELAY, bl);
    
  }//SHAPE PANEL CONSTRUCTOR
  
  
  
  /*BUTTON LISTENER PRIVATE CLASS*/
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
      
      /*IF SOURCE OF EVENT IS A TIMER*/
      if(e.getSource() instanceof Timer){
        for(int i = 0;i < count;i++){
          shapes[i].move();
        }
      }else{
        JButton jbteste = (JButton)e.getSource();
        
        /*IF SOURCE OF EVENT IS A JBUTTON*/
        if("Circle".equals(jbteste.getText())){
          if(count < (shapes.length)){
            shapes[count] = new Circle();
            count++;
          }
        }
        
        if("Square".equals(jbteste.getText())){
          if(count < (shapes.length)){
            shapes[count] = new Square();
            count++;
          }
        }
        
        if("Oval".equals(jbteste.getText())){
          if(count < (shapes.length)){
            shapes[count] = new Oval();
            count++;
          }
        }
        
        if("Smiley".equals(jbteste.getText())){
          if(count < (shapes.length)){
            shapes[count] = new Smiley();
            count++;
          }
        }
        
        if("Swirl".equals(jbteste.getText())){
          if(count < (shapes.length)){
            shapes[count] = new Swirl();
            count++;
          }
        }
        
        if("Start".equals(jbteste.getText())){
          timer.start();
        }
        
        if("Stop".equals(jbteste.getText())){
          timer.stop();
        }
        showNum.setText(Integer.toString(count));
      }
      drawPanel.repaint();
    }
  }//BUTTON LISTENER CLASS
  
  /*DRAWING PANEL PRIVATE CLASS*/
  private class DrawingPanel extends JPanel{
    
    public DrawingPanel(){
      setPreferredSize(new Dimension(400, 400));
      setBackground(Color.pink);
      
    }
    
    /*Call display methods*/
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for(int i = 0;i < count;i++){
        shapes[i].display(g);
      }
      
      //quadrantes
      //g.setColor(Color.black);
      //g.drawLine(0,200,400,200);
      //g.drawLine(200,0,200,400);
      
      
    }//PAINTCOMPONENT Method
  }//DRAWING PANEL CLASS
  
}//SHAPE PANEL CLASS