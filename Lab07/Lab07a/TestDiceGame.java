import java.util.*;
import mypackage.*;

public class TestDiceGame 
{
   public static void main( String[] args) 
   {
      DiceGame game;
      
      game = new DiceGame();
      
      System.out.println(game.play());
   }
}