

public class Song{
  private String songLine;
  
  public Song(String sLine){
    songLine = sLine;
  }
  
  public String toString(){
    return songLine;
  }
  
  public void process(){
    System.out.println("Length is: " + songLine.length());
    System.out.println("Last character: " + songLine.charAt(songLine.length()-1));
    
    int index_first_word = songLine.indexOf(' ');
    int index_second_word = songLine.indexOf(' ', index_first_word + 1);
    
    if(index_second_word != -1){
      System.out.println(songLine.substring(0, index_second_word)+"\n"+songLine.substring(index_second_word+1));
      System.out.println(songLine.charAt(index_second_word+1));
    }
    
    System.out.println(songLine.toUpperCase());//print Upper case
    
    System.out.println(songLine.replace(' ', 'x')); // x instead of ` `
    
    System.out.println("First b: "+ songLine.indexOf('b'));// print index of the first `b`
    
    System.out.println(songLine+"\n");
     
  }
}
