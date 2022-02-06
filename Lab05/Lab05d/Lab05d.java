import java.util.Scanner;

/**
 * Desing
 * @author Dilay Yigit
 * @version 07.11.2019
 */ 

public class Lab05d   
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    
    //variables
    int counter;
    double pi;
    int totalNumber;
    double error;
    
    //program code
    System.out.print("PÝ: ");
    System.out.print(Math.PI + "\n");

    System.out.print("Enter an integer: ");
    totalNumber = scan.nextInt();
    pi = 0;
    for(counter = 1; counter<= totalNumber; counter++)
    {
      pi = pi - Math.pow(-1,counter)*4/(2*counter-1);
    }
    System.out.println("pi =" + pi);
    System.out.println("Error: ");
    error = scan.nextDouble();
    
    counter= 0;
    pi = 0;
    do
    {
      counter++;
      pi = pi - Math.pow(-1,counter)*4/(2*counter-1);
    }
    while(Math.abs(Math.PI-pi)>error);
    System.out.print(pi);
  }
}