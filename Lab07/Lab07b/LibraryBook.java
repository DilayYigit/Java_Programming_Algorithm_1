public class LibraryBook 
{
   //properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;
   
   //constructor
   public LibraryBook() 
   {
      title = "";
      author = "";
      dueDate = "";
      timesLoaned = 0;
   }
   
   public LibraryBook( String title, String author, String dueDate, int timesLoaned) 
   {
      this.title = title;
      this.author = author;
      this.dueDate = dueDate;
      this.timesLoaned = timesLoaned;
   }
   
   //methods
   public String toString() 
   {
      String toString = "Title: " + title + "  Author: " + author + " Due Date: " + dueDate + " Times Loaned: " + timesLoaned;
      return toString;
   }
   public boolean onLoan() 
   {
      if(!dueDate.equals("")) 
      {
         return true;
      }
      return false;
   }
   
   public void loanBook( String dueDate) 
   {
      if (!onLoan()) 
      {
         timesLoaned++;
         this.dueDate = dueDate;
      }
      else
       System.out.println( "The book is already on loan. ");
   }
   
   public void returnBook() 
   {
      if(!dueDate.equals("")) 
      {
         dueDate = "";
         System.out.println( "The book has been successfully returned!");
      }
      else 
       System.out.println( "The book has been already returned! ");
   }
   
   public int getTimesLoaned() 
   {
      return timesLoaned;
   }
}