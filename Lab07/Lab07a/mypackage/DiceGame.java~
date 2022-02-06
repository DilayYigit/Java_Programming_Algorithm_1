package mypackage;

public class DiceGame 
{
   //properties
   private Dice dice;
   
   //constructors
   public DiceGame() 
   {
      dice = new Dice();
   }
   
   //methods
   public int play() 
   {
      int numberOfTimesFor2_6;
      
      numberOfTimesFor2_6 = 0;
      
      while( dice.roll() != 12) 
      {
         numberOfTimesFor2_6++;
      }
      
      numberOfTimesFor2_6++;
      
      return numberOfTimesFor2_6;
   }
}