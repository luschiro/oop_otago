

public class SongApp{
  public static void main (String args[]){
    Song first = new Song("While my guitar gently weeps");
    System.out.println(first.toString());
    first.process();
    
    
    
    Song second = new Song("Let it be");
    System.out.println(second.toString());
    second.process();
    
    
    Song third = new Song("Penny Lane");
    System.out.println(third.toString());
    third.process();
    
    
  }
}