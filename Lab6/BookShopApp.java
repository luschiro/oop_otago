/* BookShopApp.java
 * Lucas Rodrigues Schiavetti
 * Application class for Book support class
 * LAB 06 July 2014
 */  


public class BookShopApp{
    public static void main(String args[]){
      Book book1 = new Book();
      Book book2 = new Book();
      Book book3 = new Book();//create 3 new Book class objects
      
      book1.setTitle("Life of Pi");
      book1.setPages(348);
      book1.setPrice(28.90);//modifies data fields using constructor methods
      
      book2.setTitle("Mister Pip");
      book2.setPages(240);
      book2.setPrice(22.70);//modifies data fields using constructor methods
      
      book3.setTitle("Lord of the Rings");
      book3.setPages(1652);
      book3.setPrice(53.12);//modifies data fields using constructor methods
      
      book1.displayBook();
      book2.displayBook();
      book3.displayBook();//calls the accessor method displayBook for the three books
      
    }//end of main method
    
  }//end of application class