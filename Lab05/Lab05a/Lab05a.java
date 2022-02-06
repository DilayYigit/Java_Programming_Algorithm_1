import java.util.Scanner;

/**
 * Desing
 * @author Dilay Yigit
 * @version 07.11.2019
 */ 

public class Lab05a   
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    
    //variables
    int width;
    int height;
    int thickness;
    int h;
    int w; 
    String answer;
    
    //program code
    do
      {
         System.out.println("Enter width: ");
         width = scan.nextInt();
         
         System.out.println("Enter height: ");
         height = scan.nextInt();
         
         System.out.println( "Enter thickness: ");
         thickness = scan.nextInt();
         
         if ( width <= 0 || height <=0 || thickness <= 0)
         {
            System.out.println("Error: All inputs must be positive!");
         }
         else
         {
            for(h = 1; h <= height; h++)
            {
               for( w = 1; w<= width; w++)
               {
                  if(h > thickness && w > thickness && h <= (height - thickness) && w <=( width - thickness) )
                  {
                     System.out.print(" ");
                  }
                  else
                  {
                     System.out.print("*");
                  }
               }
               System.out.println();
            }
            if(2 * thickness >= width || 2 * thickness >= height){
               System.out.println("oops.. no hole!");
            }
         }
         
         scan.nextLine();
         System.out.println(" If you want to continue, press Y or y ");
         answer = scan.nextLine();
      }
    while (answer.equals ( "Y" ) || answer.equals ( "y"));
      System.out.print(" END ");
   }
  }

