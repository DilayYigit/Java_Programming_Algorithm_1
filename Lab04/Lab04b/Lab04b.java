import java.util.Scanner;

/**
 * Lab04b
 * @author Dilay Yigit
 * @version 31.10.2019
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int a = 100;
      int k;
      int sum;
      int n = 0;
      int min = 0;
      int max = 0;
      
      // program code
//      a = scan.nextInt();
      k = 0;
      while( n < a){
         sum = scan.nextInt();
         if(n==0)
         {
            min = sum;
            max = sum;
         }
         if(min > sum)
         {
            min = sum;
         }
         
         if(max < sum)
         {
            max = sum;
         }
         k = k + sum ;
         n = n +1;
      }
      System.out.println("average is: " + (double)k/n);
      System.out.println("sum is: " + k);
      System.out.println("count is: " + n);
      System.out.println("min is: " + min);
      System.out.println("max is: " + max);
   }
}
