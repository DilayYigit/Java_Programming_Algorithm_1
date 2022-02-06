import java.util.Scanner;

/**
 * Desing
 * @author Dilay Yigit
 * @version 07.11.2019
 */ 

public class Lab05b   
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    
    //constants
    final int CELL_SPACE = 20;
    
    //variables
    int row;
    int col;
    int r;
    int c;
    int space; 
    int counter;
    String str;
    
    //program code 
    System.out.println( "Enter row: ");
      row = scan.nextInt();
      System.out.println( "Enter column: ");
      col = scan.nextInt();
     
      System.out.println(" ");
      for( r=1 ; r<=row ; r++){
         for( c=1; c<=col; c++){
            str = r + "," + c;
            space = str.length();
            for(int k = 1; k<= CELL_SPACE - space; k++){
               str = str + " ";
            }
            System.out.print(str);
         }
         System.out.println();
      }

      System.out.println(" ");
      for( r=1; r <= row; r++){
         for(c=1; c <= col; c++){
            str = r*c + "" ;
            space = str.length();
            for(int k = 1; k<= CELL_SPACE - space; k++){
               str = str + " ";
            }
            System.out.print(str);
         }
         System.out.println();
      }
     

      System.out.println(" ");
      counter = 0;
      for(r = 1; r<= row; r++){
         for(c = 1; c<= col; c++){
            str = counter + " ";
            space = str.length();
            for( int k = 1;  k<= CELL_SPACE - space; k++){
               str = str+ " ";
            }
            System.out.print(str);
            counter++;
         }
         System.out.println();
      }

      System.out.println(" ");
      for(r=1; r <= row; r ++)
      {
         for(c=1; c <= col; c ++)
         {
           
            if( c == 1)
            {
               str = "" + r;
            }
            else
            {
               str= ",-";
            }
            for(int k = 1; k <= 1; k++){
               str = str +"";
            }
            System.out.print(str);
         }
         System.out.println();
      }
   }
}