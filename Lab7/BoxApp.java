/*Box application class
 * Lucas Rodrigues Schiavetti July 2014
 */


public class BoxApp{
  public static void main (String args[]){
    
    Box box1 = new Box(); //new object with default constructor
    box1.setHeight(4);
    box1.setLength(4);
    box1.setWidth(6);//mutators methods
    System.out.println(box1.toString());//display information
    
    Box box2 = new Box (3 , 4, 5);//new object with new constructor
    System.out.println(box2.toString());//display information
    
    Box cube = new Box(5);//new object with cube constructor
    System.out.println(cube.toString());//display information
  }
}