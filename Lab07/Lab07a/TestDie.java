import java.util.*;
import mypackage.*;

public class TestDie 
{
   
   public static void main( String[] args) 
   {
      Die die;
      
      die = new Die();
      
      System.out.println( die.getFaceValue());
      System.out.println( die.roll());
      System.out.println( die.getFaceValue());
      System.out.println( die);
      System.out.println( die.toString());
      
      int die1;
      int die2;
      /*
      int die3;
      .
      .
      .
      int die20;
      */
      
      int count;
      die1 = 0;
      die2 = 0; 
      count = 0;
      
      do {
      die1 = (int)(Math.random() * 6) + 1;
      die2 = (int)(Math.random() * 6) + 1;
      /*
      die3 = (int)(Math.random() * 6) + 1;
      .
      .
      . 
      die20 = (int)(Math.random() * 6) + 1;
      */
      count++;
      
      }while (die1 + die2 != 12);
      
      System.out.println(count);
   }
}
