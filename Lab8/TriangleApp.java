/*Application Class TriangleApp
 * Lucas Rodrigues Schiavetti August 2014
 * Lab8
 */

import java.text.DecimalFormat;

public class TriangleApp{
  public static void main(String args[]){
    
    DecimalFormat df1 = new DecimalFormat();//create new instance of DecimalFormat 
    df1.setMaximumFractionDigits(2);//set the fraction digits to 2
    
    Triangle A = new Triangle (0,3,3,4,1,9,"A"); //create new Triangle object A with parameters: point coordenates and name
    System.out.println("Triangle " + A.getName() + " perimeter is " +df1.format(A.getPerimeter()));
    
    
    Triangle B = new Triangle (4,2,9,4,6,7,"A"); //create new Triangle object A with parameters: point coordenates and name
    System.out.println("Triangle " + B.getName() + " perimeter is " +df1.format(B.getPerimeter()));
    
    
    Triangle C = new Triangle (0,0,3,0,3,4,"C"); //create new Triangle object A with parameters: point coordenates and name
    System.out.println("Triangle " + C.getName() + " perimeter is " +df1.format(C.getPerimeter()));//display information calling accessor methods
  }
}