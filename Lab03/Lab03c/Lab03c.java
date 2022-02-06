import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

/**
 * Webpage
 * @author Dilay Yigit
 * @version 24.10.2019
 */ 
public class Lab03c
{
  public static void main( String[] args) throws FileNotFoundException
  {
    Scanner scan = new Scanner( System.in);
    
    PrintStream originalStdOut = System.out;
    
    // variables
    String name;
    int salary;
    int age;
    String comment;
    int netSalary;
    
    // program code
    
    name = scan.next();
    scan.nextLine();
    age = scan.nextInt();
    salary = scan.nextInt();
    scan.nextLine();
    comment = scan.nextLine();
    
    System.setOut( new PrintStream( "magic.htm" ) );
    
    if ( age < 0 )
    {
      System.out.println("ERROR");
    }
    if ( salary < 100000 )
    {
      if ( salary < 1000 )
      {
        netSalary = (( salary - 100 ) * 95 ) / 100;
      }
      else if ( salary > 5000 )
      {
        netSalary = (( salary - 100 ) * 75 ) / 100;
      }
      else
      {
        netSalary = (( salary - 100 ) * 85 ) / 100;
      }
      
      //HTML code
      System.out.println("<!DOCTYPE html>");
      System.out.println("");
      System.out.println("<html>");
      System.out.println("");
      System.out.println("<head>");
      System.out.print("<title>");
      System.out.print(name);
      System.out.print("'s Home Page</title>");
      System.out.println("<head>");
      System.out.println("");
      System.out.println("<body>");
      System.out.println("");
      System.out.println("<hr>");
      if (Files.exists( Paths.get( name + ".jpg" ) ))
      {
        System.out.println("<img src=" + name + ".jpg>");
      }
      System.out.print("<h1>");
      System.out.print(name);
      System.out.println("</h1>");
      System.out.print("<p>Age: ");
      System.out.print(age);
      System.out.println("</p>");
      System.out.print("<p>Salary: ");
      System.out.print(netSalary);
      System.out.println("</p>");
      System.out.print("<p>Comments: ");
      System.out.print(comment);
      System.out.println("</p>");
      System.out.println("<hr>");
      System.out.println("");
      System.out.println("</body>");
      System.out.println("");
      System.out.println("</html>");
      
      System.out.close();
      System.setOut( originalStdOut);
      System.out.println( "Webpage created.");
    }
  }
}