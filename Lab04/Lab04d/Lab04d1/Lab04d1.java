import java.util.Scanner;

/**
 * Lab04d1
 * @author Dilay Yigit
 * @version 31.10.2019
 */ 
public class Lab04d1
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      int lineNumber;
      int lineNumber2;
      String character;
      int numberofLine;
      
      
      // program code
      System.out.print("Enter a character: ");
      character = scan.next();
      System.out.print("Enter the number of line: ");
      numberofLine = scan.nextInt();
      
      
      lineNumber = numberofLine;
      while( lineNumber > 0)
      {
         lineNumber2 = lineNumber;
         while(lineNumber2 <= numberofLine)
         {
            System.out.print( character );
            lineNumber2 = lineNumber2 + 1 ;
         }
         System.out.println();
         lineNumber = lineNumber -1;
      }
   }
}


