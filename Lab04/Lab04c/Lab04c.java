import java.util.Scanner;

/**
 * Lab04c
 * @author Dilay Yigit
 * @version 31.10.2019
 */ 
public class Lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int x;
      int n;
      int i;
      double average;
      int max;
      int min;
      int a;

      // program code
      i= 0;
      x = 0;
      min = Integer.MAX_VALUE;
      max = Integer.MIN_VALUE;
      n = scan.nextInt();
      while(n > 0)
      {
         x = x + n; 
         min = Math.min(min,n);
         max = Math.max(max,n);
         i++;
         n = scan.nextInt();
      }
      average = (double)x / i;
      System.out.println("Sum = " + x);
      System.out.println("Maximum = " + max);
      System.out.println("The average = " + average);
      System.out.println("Minimum = " + min);
   }
}
