/**
 * A class to be used on top of the libraryBooks to Simulate the operations inside the Library
 * @author Dilay Yi?it
 * @version 12.12.2019
 */ 


import java.util.ArrayList;

public class Library {

    ArrayList<LibraryBooks> arrayLibraryBooks;
    LibraryBooks tempBook = null;

    public Library() // new constructor
    {
        arrayLibraryBooks = new ArrayList<LibraryBooks>();
        tempBook = new LibraryBooks("", "");
    }

    public boolean isEmpty()
    {
        if (this.arrayLibraryBooks.size() == 0)
            return true;
        else
            return false;
    }

    public void libraryToString()
    {
        for (int counter = 0; counter < arrayLibraryBooks.size(); counter++)
        {
            System.out.println(arrayLibraryBooks.get(counter).bookToString());
        }
    }

    public void addBook(String title, String author)
    {
        LibraryBooks tempBook = new LibraryBooks(title, author);
        this.arrayLibraryBooks.add(tempBook);
    }

    public void removeBook(LibraryBooks books)
    {
        for (int counter = 0; counter < arrayLibraryBooks.size(); counter++)
        {
            tempBook = arrayLibraryBooks.get(counter);

            if (tempBook == books)
            {
                arrayLibraryBooks.remove(counter);
            }
        }
    }

    public LibraryBooks findByTitle(String title)
    {
      for (LibraryBooks book : arrayLibraryBooks)
        {
            if (book.getTitle() == title) {
            }
        }

        if (tempBook != null)
            return tempBook;
        else
            return null;
    }

    public Library nullPrinter() // treturns null value so we can use it to print (null) rather than pritn("null")
    {
        Library nullBook = null;
        return nullBook;
    }

}
