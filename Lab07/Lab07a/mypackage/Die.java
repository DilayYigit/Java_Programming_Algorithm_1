package mypackage;

public class Die 
{
   
   // properties
   private int currentFaceValue;
   
   // constructors
   public Die() 
   {
      currentFaceValue = roll();
   }
   
   // methods
   public int roll() 
   {
      currentFaceValue = (int)(Math.random() * 6) + 1;
      
      return currentFaceValue;
   }
   
   public int getFaceValue() 
   {
      return currentFaceValue;
   }
   
   public String toString() 
   {
      return "" + currentFaceValue;
   }
   
}