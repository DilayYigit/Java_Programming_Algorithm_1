/**
 * A class to be used for the operations in a Library
 * @author Dilay Yi�it
 * @version 12.12.2019
 */ 

public class LibraryBooks
{

    // Properties

    String title;
    String author;
    String dueDate;

    int timesLoaned;

    boolean loaned;

    // Constructors

    public LibraryBooks(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.dueDate = "";
        this.timesLoaned = 0;
        this.loaned = false;
    }

    // Methods

    public String getTitle() { // Getter and Setter Methods
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean onLoan()
    {
        return this.loaned;
    }

    public void setLoan(boolean loaned)
    {
        this.loaned = loaned;
    }

    public void setDueDate(String string)
    {
        this.dueDate = string;
    }

    public int timesLoaned()
    {
        return this.timesLoaned;
    }

    public void loanBook() // loaning method
    {
        if (!(this.onLoan()))
        {
            this.timesLoaned++;
            this.setDueDate("15 days from now");
            this.setLoan(true);
        }
        else
        {
            System.out.println("The book you are trying to loan is loaned please try another time");
        }
    }

    public void returned() // returning method
    {
        this.setDueDate("");
        this.setLoan(false);
    }

    public static boolean equals(LibraryBooks b1, LibraryBooks b2) // Checking if two books are same == equal
    {
        if (b1.equals(b2))
            return true;
        else
            return false;
    }

    public static boolean authorIsSame(LibraryBooks b1, LibraryBooks b2) // checking if th author is same for given two books
    {
        if (b1.getAuthor() == b2.getAuthor())
            return true;
        else
            return false;
    }

    public static boolean titleIsSame(LibraryBooks b1, LibraryBooks b2)
    {
        if (b1.getTitle() == b2.getTitle())
            return true;
        else
            return false;
    }

    public String bookToString()
    {
        return this.getAuthor() + " " + this.getTitle();
    }

}