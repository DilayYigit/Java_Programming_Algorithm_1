/**
 * Library
 * @author Dilay Yiðit
 * @version 28.11.2019
 */
public class TestLibraryBook
{
   public static void main( String[] args)
   {

      // variables
      LibraryBook book1;
      LibraryBook book2;
      LibraryBook book3;
      LibraryBook book4;
      
      // program code
      
      book1 = new LibraryBook( "The Metamorphosis", "Franz Kafka", "26.05.2019", 1 );
      book2 = new LibraryBook( "Lord of the Rings", " J.R.R. Tolkien", "05.10.2019", 1 );
      book3 = new LibraryBook( "Anna Karenina", "Lev Tolstoy", "", 0 );
      book4 = new LibraryBook( "Notes from Underground", "Dostoyevski", "", 0 );
      
      System.out.println( book1 );
      System.out.println( book2 );
      System.out.println( book3 );
      System.out.println( book4 );
      System.out.println();
      
      book1.loanBook( "28.01.2020" );
      book4.loanBook( "16.06.2021" );
      System.out.println();
      
      book2.returnBook();
      book3.returnBook();
      System.out.println();
      
      System.out.println( "book1 is free to loan " + book1.onLoan() );
      System.out.println( "book2 is free to loan " + book2.onLoan() );
      System.out.println( "book3 is free to loan " + book3.onLoan() );
      System.out.println( "book4 is free to loan " + book4.onLoan() );
      
      book2.loanBook( "28.01.2020" );
      book3.loanBook( "16.06.2021" );
      System.out.println();
      
      book2.returnBook();

      book2.loanBook( "27.05.2018" );
      System.out.println();
      
      System.out.println( "book1 " + book1.getTimesLoaned() + " times loaned");
      System.out.println( "book2 " + book2.getTimesLoaned() + " times loaned");
      System.out.println( "book3 " + book3.getTimesLoaned() + " times loaned");
      System.out.println( "book4 " + book4.getTimesLoaned() + " times loaned");
   }
}