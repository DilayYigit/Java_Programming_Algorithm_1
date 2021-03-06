import java.util.Scanner;

/**
 * Lab04a
 * @author Dilay Yigit
 * @version 31.10.2019
 */ 
public class Lab04a
{
  public static void main( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    
    // variables
    int n;
    int count = 0;
    
    // program code
    System.out.printf("Enter a positive integer: ");
    n = scan.nextInt();
    
    //1
    if (n > 0)
    {
      while (count < n)
      {
        count++;
        System.out.printf(" " + count); 
      }
      System.out.println();
      System.out.println();
      
      //2
      count = 0;
      while (count < n)
      {
        count++;
        if (count % 5 != 0)
        {
          System.out.printf( count + " ");
        }
        else 
          System.out.printf(count + " \n" );
      }
      System.out.println();
      System.out.println();
      
      //3
      count = n;
      while (0 < count)
      {
        System.out.printf(" " + count);
        count--;;
      }
      System.out.println();
      System.out.println();
      
      //4
      count = -n;
      while(count <= n)
      {
        if (count % 2 == 0)
        {
          System.out.printf( " " + count);
        }
        count++;
      }
      System.out.println();
      System.out.println();      
      
      //5
      count = 0;
      int counter = 1;
      while(count <= n)
      {
        int square = count * count;
        if (count %2 == 0)
        {
          if (counter % 5 != 0)
          {
            System.out.printf( " " + square);
            count++;
          }
          else 
          {
            System.out.println(" " + square);
            count++;
          }
        }
        count++;
      }
      System.out.println(" ");
      System.out.println(" ");
      
      //6
      count = n - 1;
      int x = 0;
      int y = 0;
      while(x < n)
      {
        if (count % 4 == 0 || count % 3 == 0)
        {
          if (count % 12 == 0)
          {
            count--;
          }
          else
          {
            y++;
            if (y % 6 != 0)
            {
              System.out.print(count + " ");
            }
            else 
              System.out.println();
          }
          count--;
        }
        else 
        {
          count--;
      }
      x++;
      }
      System.out.println(" ");
      System.out.println(" ");      
      
      //7
      count = 0;
      while (count <= n)
      {
        count++;
        if (n % count == 0)
        {
          System.out.print(count + " ");
        }
      }
      System.out.println(" ");
      System.out.println(" ");      
   
    
      //8
      count = 1;
      while (count < n)
      {
        if (1/count > 0.01)
        {
          System.out.print( (Math.floor(1/count)) + " ");
        }
        count++;
      }
    }
    else
      System.out.println("ERROR!");
  }
}

