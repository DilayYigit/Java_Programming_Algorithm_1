import java.util.Scanner;

/**
 * Webpage
 * @author Dilay Yigit
 * @version 17.10.2019
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      String name;
      int salary;
      int age;
      String comment;
      
      // program code
      //System.out.println("Enter name: ");
      name = scan.next();
      
      scan.nextLine();
      
      //System.out.println("Enter age: ");
      age = scan.nextInt();
      
      //System.out.println("Enter salary: ");
      salary = scan.nextInt();
      
      scan.nextLine();
      
      //System.out.println("Enter comment: ");
      comment = scan.nextLine();
      
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
      System.out.print("<h1>");
      System.out.print(name);
      System.out.println("</h1>");
      System.out.print("<p>Age: ");
      System.out.print(age);
      System.out.println("</p>");
      System.out.print("<p>Salary: ");
      System.out.print(salary);
      System.out.println("</p>");
      System.out.print("<p>Comments: ");
      System.out.print(comment);
      System.out.println("</p>");
      System.out.println("<hr>");
      System.out.println("");
      System.out.println("</body>");
      System.out.println("");
      System.out.println("</html>");
   }

}