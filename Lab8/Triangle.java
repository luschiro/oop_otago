/*Class Triangle
 * Lucas Rodrigues Schiavetti August 2014
 * Lab8
 */

public class Triangle{
  private int p1x, p1y, p2x, p2y, p3x, p3y;
  private String name; //data fields
  
  public Triangle(int pt1x, int ptly, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    p1x=pt1x;
    p2x=pt2x;
    p2y=pt2y;
    p3x=pt3x;
    p3y=pt3y;
    
    name = nameIn;
  } //new constructor
  
  private double calcSide(int x1, int y1, int x2, int y2){
    return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
  }//end CalcSide method
  
  public double getPerimeter(){
    return calcSide(p1x, p1y, p2x, p2y) + calcSide(p2x, p2y, p3x, p3y) + calcSide (p1x, p1y, p3x, p3y);
  }// end getPerimeter accessor method
  
  public String getName(){
    return name;
  }// end getName accessor methor
  
}//end class