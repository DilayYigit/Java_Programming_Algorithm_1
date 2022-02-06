/**
 * Library
 * @author Dilay Yiðit
 * @version 12.12.2019
 */ 

import java.util.*;

public class Lab09a {
  
  public static void main(String[] args) {
    
    // Constants
    
    Scanner scan = new Scanner(System.in);
    Library library = new Library();
    LibraryBooks book = null; 
    
    // Variables
    
    String divider;
    String title;
    String author;
    
    int userInput;
    
    // Initialling
    
    divider = "------------------------------------------------------------";
    userInput = 0;
    
    // Programme
    
    System.out.println("Welcome to the Library");
    
    while ( userInput != 4) // Starting the UI loop
    {
      System.out.println("-------------------------");
      System.out.println("Please choose an axion");
      System.out.println("-------------------------");
      System.out.println("1) To see the library");
      System.out.println("2) To find a book");
      System.out.println("3) To add a book");
      System.out.println("4) To exit");
      
      userInput = scan.nextInt();
      
      if(userInput == 1){
        System.out.println(divider);
        library.libraryToString();
      }
      else if(userInput == 2){
        System.out.println("Please enter the title of the Book to find it :");
        title = scan.next();
        book = library.findByTitle(title);
        if (book != null){
          System.out.println(book.bookToString());
          System.out.println(divider); // Creating the subMenu
          System.out.println("Please choose the action you want to do withthe book:");
          System.out.println(" ");
          System.out.println("1) To loan the book");
          System.out.println("2) To return the book");
          System.out.println("3) To remove the book");
          System.out.println(divider);
          userInput = scan.nextInt();
          
          if(userInput == 1){
            System.out.println("Trying to loan the book...");
            book.loanBook();
          }
          else if (userInput == 2){
            System.out.println("Trying to return the book...");
            book.returned();
          }
          else if(userInput == 3){
            System.out.println("Removing the book...");
            library.removeBook(book);
          }
        }
      }
      else if(userInput == 3){
        System.out.println("Please enter the title of the book :");
        title = scan.next();
        scan.nextLine(); 
        System.out.println("Please enter the author of the book :");
        author = scan.next();
        library.addBook(title, author);
        System.out.println(divider);
      }
      else if(userInput == 4){
        System.out.println(divider);
        System.out.println("Exiting... the library Good Bye");
        System.out.println(divider);
      }
    }
    
  }
}

