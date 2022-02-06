import java.util.Scanner;

/**
 * Lab04d2
 * @author Dilay Yigit
 * @version 31.10.2019
 */ 
public class Lab04d2
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      double d;
      
      // program code
      d = 0.1;
      while(d <= 1.0){
         System.out.println ( d);
         d = d + 0.1;
      }
      System.out.println( d + " <- final value after loop!");
   }
}
 