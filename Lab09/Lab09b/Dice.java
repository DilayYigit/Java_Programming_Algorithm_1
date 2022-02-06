/**
 * Dice
 * @author Dilay Yiðit
 * @version 12.12.2019
 */ 

import java.util.ArrayList;
import java.util.Collections;

public class Dice {

    // Properties

    private Die die_1;
    private Die die_2;
    private int number1;
    private int number2;

    // Constructors

    public Dice() {
        die_1 = new Die();
        die_2 = new Die();
    }

    // Methods

    private int roll() {
        number1 = die_1.roll();
        number2 = die_2.roll();
        return number1 + number2;
    }

    private int getDie1FaceValue() {
        return die_1.getFaceValue();
    }

    private int getDie2FaceValue() {
        return die_2.getFaceValue();
    }

    private int getDiceTotal() {
        return die_1.getFaceValue() + die_2.getFaceValue();
    }

    public String toString() {
        return die_1.getFaceValue() + " " + die_2.getFaceValue();

    }

    private static ArrayList<Integer> dataCreator() // A method for creating 1000 rolls
    {
        Dice dice;
        ArrayList<Integer> arrayData;

        dice = new Dice();
        arrayData = new ArrayList<Integer>();

        for (int counter = 0; counter < 1000; counter++)
        {
            arrayData.add(dice.getDiceTotal());
            dice.roll();
        }

        return arrayData;
    }

    public static void histogramCreator()  // Creating a Histogram with the 1000 datas which we have created from the method above.
    {
        ArrayList<Integer> arrayData;
        ArrayList<Integer> maxValue;
        
        maxValue = new ArrayList<Integer>();
        arrayData = dataCreator();

        int frequence;
        int max;
        int total;
        int empty;
         
        frequence = 0;
        total = 0;
        empty = 0;

        for (int counter = 2; counter <= 12; counter++)
        {
            for (int subCounter = 0; subCounter < arrayData.size(); subCounter++)
            {
                if (arrayData.get(subCounter) == counter)
                {
                    total++;
                }
            }
            maxValue.add(total);
            total = 0;
        }
        
        max = Collections.max(maxValue);
        
        for (int counter = 10; 0 < counter; counter--)
        {
          for (int subCounter = 0; subCounter <= 10; subCounter++)
          {
            if ((10 * maxValue.get(subCounter)) / max <= counter)
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
        System.out.println(maxValue);
    }
}