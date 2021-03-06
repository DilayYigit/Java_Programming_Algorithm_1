// Dilay Yi?it
// 05.12.2019

package Library;
/**
 * Auto Generated Java Class.
 */
public class Library {
   
   /* ADD YOUR CODE HERE */
    LibraryBooks b1, b2, b3, b4;

  public Library() // new constructor 
    {
        b1 = null;
        b2 = null;
        b3 = null;
        b4 = null;
    }
     /**
     * This is a brief description of the method.
     * chechking the emptyness
     * @return boolean 
     */
    public boolean isEmpty() // checking if it is empty 
    {
        if (b1 == null)
            return true;
        else
            return false;
    }
    /**
     * This is a brief description of the method.
     * @return write string 
     */
    public void libraryToString() // converting to string 
    {
        if (b1 != null)
            System.out.println(b1.bookToString());
        else
            System.out.println(nullPrinter());

        if (b2 != null)
            System.out.println(b2.bookToString());
        else
            System.out.println(nullPrinter());

        if (b3 != null)
            System.out.println(b3.bookToString());
        else
            System.out.println(nullPrinter());

        if (b4 != null)
            System.out.println(b4.bookToString());
        else
            System.out.println(nullPrinter());
    }
     /**
     * This is a brief description of the method.
     * @return tempBook
     */
    public void addBook(String title, String author) // adding a book to the library 
    {
        LibraryBooks tempBook = new LibraryBooks(title, author);        
        // Chechking the library 
        
        if (b1 == null)
            b1 = tempBook;
        else if (b2 == null)
            b2 = tempBook;
        else if (b3 == null)
            b3 = tempBook;
        else if (b4 == null)
            b4 = tempBook;
        else
            System.out.println("Sorry Library is Full");
    }
    
     /**
     * This is a brief description of the method. Remove
     * @return null
     */
    public void removeBook(LibraryBooks book) // removing a book from the library
    {

        if (book == b1)
            b1 = null;

        else if (book == b2)
            b2 = null;

        else if (book == b3)
            b3 = null;

        else if(book == b4)
            b4 = null;

        else
            System.out.println("Book you wanted to remove is not inside the Library");
    }
     /**
     * This is a brief description of the method. Find the book
     * @return the book
     */
    public LibraryBooks findByTitle(String title)  // finding a book by it s titles method uses .equals and .getTitle 
    {
        if (b1!=null  && title.equals(b1.getTitle()))
            return b1;

        else if (b2!=null && title.equals(b2.getTitle()))
            return b2;

        else if (b3!=null &&  title.equals(b3.getTitle()))
            return b3;

        else if (b4!=null &&  title.equals(b4.getTitle()))
            return b4;

        else
        {
          System.out.println("That book wasn't able to found");
          return null;  
        }
    }
     /**
     * This is a brief description of the method. replace and returns null again.
     * @return nullBook
     */
    public Library nullPrinter() // returns null value so we can use it to print (null) rather than print("null")
    {
        Library nullBook = null;
        return nullBook;
    }
   
}
