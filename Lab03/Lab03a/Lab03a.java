import java.util.Scanner;

/**
 * Even and Odd Numbers
 * @author Dilay Yigit
 * @version 24.10.2019
 */ 
public class Lab03a
{
  public static void main( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    
    // variables
    int even = 0;
    int odd = 0;
    
    // program code
    for ( int x = 0; x <= 50; x++ )
    {
      if ( x % 2 == 0)
      {
        even++;
      }
      else
      {
        odd++;
      }
      if ( 12 > x || 25 < x)
      {
        System.out.println( x + " out of range 12-25");
      }
      else
      {
        System.out.println(x);
      }
      if ( x % 5 == 0 )
      {
        System.out.println(x + " HiFive");
      }
      else if ( x % 2 == 0)
      {
        System.out.println( x + " HiTwo");
      }
      else if ( x % 3 == 0 && x % 7 == 0 )
      {
        System.out.println( x + " HiThreeOrSeven");
      }
      else 
        System.out.println( x + " HiOthers");
    }
    System.out.println("ODD: " + odd);
    System.out.println("EVEN: " + even);
  }
}
