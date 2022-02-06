package Library;

public class LibraryBooks 
{

    // Properties

    private String title;  
    private String author;
    private String dueDate;

    private int timesLoaned;

    private boolean loaned;

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
    // Getter and Setter Methods 

    public String getTitle()  
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
      
    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
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

    public String getDueDate()
    {
       return dueDate;
    }
    
    public void setDueDate(String string)
    {
        this.dueDate = string;
    }

    public int timesLoaned()
    {
        return this.timesLoaned;
    }

    public void loanBook() // Loaning method!! using booleans.
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
     /**
     * This is a brief description of the method. Equals
     * @return True or False
     */
    public boolean equals(LibraryBooks b1) // Checking if two books are same with .equals()
    {
        if (title == b1.title && author == b1.author)
            return true;
        else
            return false;
    }
     /**
     * This is a brief description of the method. Author's name chechk
     * @return True or False
     */
    public static boolean authorIsSame(LibraryBooks b1, LibraryBooks b2) // chechking if the author is same for given two books with .equals()
    {
        if (b1.getAuthor() == b2.getAuthor())
            return true;
        else
            return false;
    }
     /**
     * This is a brief description of the method. Title's chechk
     * @return True or False
     */
    public static boolean titleIsSame(LibraryBooks b1, LibraryBooks b2) // Chechking the title of the book's are same or not with .equals()
    {
        if (b1.getTitle() == b2.getTitle())
            return true;
        else
            return false;
    }
     /**
     * This is a brief description of the method. Title's chechk Book to string represetation.
     * @return string 
     */
    public String bookToString()
    {
        return this.getAuthor() + " " + this.getTitle();
    }
   
}
