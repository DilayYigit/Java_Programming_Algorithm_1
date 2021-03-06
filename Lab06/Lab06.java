import java.util.Scanner;
/**
 * Lab06
 * Dilay Yigit
 * 14.11.2019
 */ 
public class Lab06 
{
  
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner (System.in);
    
    //variables
    int n;
    String firstBinary;
    String secondBinary;
    double sum;
    String s;
    double x;
    double xSquare;
    
    //part1
    System.out.println("PART 1");
    for ( n = -1; n <= 10; n++ )
    {
      System.out.print( xSpace( intToString( n ), 8 ) );
      System.out.print( xSpace( intToString( (int)( Power
                                                     ( n, 2 ) ) ), 8 ) );
      System.out.print( xSpace( intToString( (int)( Power
                                                     ( n, 3 ) ) ), 8 ) );
      System.out.println( xSpace( intToString( (int)( Power
                                                       ( n, 4 ) ) ), 8 ) );
    }
    
    //part2
    System.out.println("PART 2");
    for ( n = 1; n <= 15; n++)
    {
      System.out.println( xSpace(( intToString( n )) ,6) + Factorial(n));
    }
    
    //part3
    System.out.println("PART 3");
    System.out.print( "Enter first binary: " );
    firstBinary = scan.next();
    System.out.print( "Enter second binary: " );
    secondBinary = scan.next();
    
    sum = toDecimal( firstBinary ) + toDecimal( secondBinary );
    System.out.println( decimalToBinary( (int)( sum ) ) );
    
    
    //part4
    System.out.println("PART 4");
    s = scan.nextLine();
    s = scan.nextLine();
    String[] parts = s.split(" ");
    
    for( n = 0; n < countWords( s ); n++ ){
      System.out.print( Reverse( parts[n] ) + " " );
    }
    
    //part5
    System.out.println("PART 5");
    x = scan.nextDouble();
    sum = 0;
    for ( n = 0; n < 10; n++ )
    {
      sum = sum + Power( -1 , n ) * Power( x , 2 * n + 1 ) / ( Factorial( 2 * n + 1 ) );
    }
    System.out.println( sum );
    
    //part6
    System.out.println("PART 6");
    x = scan.nextDouble();
    sum = 0;
    
    xSquare = Power( x, 2 );
    for ( n = 0; n < 10; n++ )
    {
      if ( n % 2 == 0 )
      {
        sum = sum + x;
      }
      else
      {
        sum = sum - x;
      }
      x = x * xSquare / ( ( 2 * n + 2 ) * ( 2 * n + 3 ) );
    }
    System.out.println( sum );
  }
  
  
  //METHODS
  
  //part1
  
  public static double Power(double x, int y)
  {
    int count;
    double result;
    
    result = 1;
    count = 0;
    
      while (count < y)
      {
        result = result * x;
        count++;
      }
    return result;
  }
  
  //part2
  
  public static long Factorial (int n)
  {
    long count;
    long product;
    product = 1;
    if ( n > 0 )
    {
      for (count = n; count > 0; count--)
      {
        product = product * count;
      }
      return product;
    }
    else {
      System.out.println("Error");
    }
    return product;
  }
  
  //part3
  
  public static String Reverse (String s)
  {
    int count;
    String reverse;
    reverse = "";
    
    for (count = (s.length() - 1); count >= 0; count--)
    {
      reverse = reverse + s.charAt (count);
    }
    return reverse;
  }
  
  //part4
  
  public static int toDecimal (String base2)
  {
    int count;
    double sum;
    sum = 0;
    
    for (count = base2.length(); count > 0; count--)
    {
      if (base2.charAt(count-1) == '1')
      {
        sum = sum + Power(2, base2.length() - count);
      }
    }
    return (int)(sum);
  }
  
  //part5
  
  public static String decimalToBinary (int x)
  {
    int count;
    String binaryString;
    
    count = 1;
    binaryString = " ";
    
    do {
      if (x % (int)(Power(2,count)) != 0)
      {
        binaryString = "1" + binaryString;
        x = x - (int)(Power(2, count-1));
      }
      else if (x != (int)(Power(2, count-1)))
      {
        binaryString = "0" + binaryString;
      }
      else
      {
        x = 0;
        binaryString = "1" + binaryString;
      }
      count++;
    } while (x != 0);
    return binaryString;
  }
  
  // toString method
  public static String intToString ( int x )
  {
    String reversionToString;
    reversionToString = "" + x;
    return reversionToString;
  }
  
  // number of space method
  public static String xSpace( String s, int x )
  {
    String numberOfSpaces;
    int n;
    
    numberOfSpaces = "";
    for ( n = 0; n < x - s.length(); n++ )
    {
      numberOfSpaces = numberOfSpaces + " ";
    }
    return s + numberOfSpaces;
  }
  public static int countWords (String str)
  {
    int count = 1;
    for ( int i = 0; i <= str.length() - 1 ; i++ )
    {
      if ( str.charAt( i ) == ' ' && str.charAt( i+1 ) != ' ' )
      {
        count++;
      }
    }
    return count;
  }
  
  
  
  
  
  
}



