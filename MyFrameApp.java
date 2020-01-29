import java.awt.Color;

public class MyFrameApp{
  public static void main(String args[]){
    
    MyFrame m1 = new MyFrame();
    m1.setSize(300,150);
    m1.setVisible(true);//creat new instance (object) of MyFrame class
    
    MyFrame m2 = new MyFrame();
    m2.setSize(300,150);
    m2.setVisible(true); //creat new instance (object) of MyFrame class

    m1.decorate(Color.red, "M1 frame", 180 );//calls decorate method for the m1 object
    m2.decorate(Color.green, "M2 frame", 10 );//calls decorate method for the m2 object
  }//end main
  
}//end class