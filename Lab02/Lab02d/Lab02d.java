import java.util.Scanner;

/**
 * Triangle
 * Dilay Yigit
 * 17.10.2019
 */ 
public class Lab02d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      double a;
      System.out.println("Enter a: ");
      a = scan.nextDouble();
      
      double b;
      System.out.println("Enter b: ");
      b = scan.nextDouble();
      
      double c; 
      System.out.println("Enter c: ");
      c = scan.nextDouble();
      
      double Area;
      double s;

      // program code
      s = (a + b + c) / 2;
      Area = Math.sqrt( s * (s - a) * (s -b) * (s - c));
      
      System.out.println( " Area of the triangle: " + Area);
      System.out.print( Area * 17 + " flower can be planted.");
   }
} 
