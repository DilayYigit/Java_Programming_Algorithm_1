import java.util.Scanner;

/**
 * Calculator
 * @author Dilay Yigit
 * @version 17.10.2019
 */ 
public class Lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      System.out.println("Enter first number: ");
      int input1;
      input1 = scan.nextInt();
      
      System.out.println("Enter second number: ");
      int input2;
      input2 = scan.nextInt();
      
      int sum;
      int difference;
      int division; 
      int reminder;
      int multiple;

      // program code
      sum = input1 + input2;
      System.out.println("SUM: " + sum);
      
      multiple = input1 * input2;
      System.out.println("MULTIPLE: " + multiple);
      
      if (input1 > input2)
      {
        difference = input1 - input2;
        division = input1 / input2;
        reminder = input1 % input2;
      }
      else
      {
        difference = input2 - input1;
        division = input2 / input1;
        reminder = input2 % input1;
      }
      System.out.println("DIFFERENCE: " + difference);
      System.out.println("DIVISION: " + division);
      System.out.println("REMINDER: " + reminder);
      System.out.println("MAXIMUM: " + Math.max(input1, input2));
      System.out.println("MINIMUM: " + Math.min(input1, input2));
      
   }

}