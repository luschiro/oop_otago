/*Programming Projects PP 4.1
 *Lucas Rodrigues Schiavetti August 2014
 *COMP160
 */

public class LeapYearApp{
  public static void main(String args[]){
    leapYear(2010);
    leapYear(2012);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);
    //this block call the leapYear method for different years
  }//end of main
  
  
  /*test the year: first if it is < 1582 and then if it is not a leap year.All years left are leap years (last else)*/
  public static void leapYear(int year){
  if(year < 1582)
    System.out.println(year + ": predates the Gregorian calendar");
  else if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0))
    System.out.println(year + ": is not a leap year");
  else
    System.out.println(year + ": is a leap year");
  }//end of leapYear()
    
}