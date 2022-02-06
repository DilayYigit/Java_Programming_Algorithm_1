import java.util.Scanner;

/**
 * Desing
 * @author Dilay Yigit
 * @version 07.11.2019
 */ 

public class Lab05c   
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    
    //variables
    double value;
    char operator
;
    double tempValue;
    String text;
    String valueString;
    
    System.out.println(" Welcome to Simple Calculator ");
    tempValue = 0;
    
    do
    {
      System.out.println( "--------------");
      System.out.println( "[" + tempValue + "]" );
      System.out.println( "--------------");
      
      text = scan.nextLine();
      operator = text.charAt(0);
      System.out.println("+, -, *, / value");
      System.out.println("Clear");
      System.out.println("Quit: 'q'");
      System.out.println("Select: " + text);
      
      if( operator == '+' || operator == '-' || operator == '/' || operator == '*')
      {
        valueString = text.substring(2);
        value = Double.parseDouble(valueString);
        
        if(operator == '+')
        {
          tempValue = tempValue + value;
        }
        else if ( operator == '-')
        {
          tempValue = tempValue - value;
          
        }
        else if ( operator == '/')
        {
          tempValue = tempValue / value;
          
        }
        else if ( operator == '*')
        {
          tempValue = tempValue * value;
        }       
        
      }
      if ( text.equals("Clear") || text.equals("clear") || text.equals("C")   || text.equals("c")){
        tempValue = 0;
      }
    }
    while( !text.equals("q"));
    if ( text.equals("q"));
  }
}