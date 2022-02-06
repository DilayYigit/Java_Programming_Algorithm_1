package mypackage;

public class Dice 
{
   //properties
  private Die die1;
  private Die die2;
   
   //constructors
   public Dice() 
   {
      die1 = new Die();
      die2 = new Die();
   }
   
   //methods
   public int roll() 
   {
      return die1.roll() + die2.roll();
   }
   
   public int getDie1FaceValue() 
   {
      return die1.getFaceValue();
   }
   
   public int getDie2FaceValue() 
   {
      return die2.getFaceValue();
   }
   
   public String toString() 
   {
      return "" + roll();
   }
   
   public int getDiceTotal() 
   {
      return roll();
   }
}