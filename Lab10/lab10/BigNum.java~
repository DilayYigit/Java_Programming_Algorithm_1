// @Author Dilay Yiðit
// @Date 19/12/2019

public class BigNum
{
    private static final int SIZE = 8;
    private static final int BASE = 2;

    private int[] numberArray;

    public BigNum()
    {
        numberArray = new int[SIZE];

        for (int counter = 0; counter < SIZE; counter++)
        {
            numberArray[counter] = 0;
        }
    }

    public BigNum(String bigNumber)
    {
        numberArray = new int[SIZE];

        for (int counter = 0; counter < SIZE; counter++)
        {
            if (counter <= bigNumber.length() -1)
                numberArray[bigNumber.length() - (counter + 1) ] = Character.getNumericValue(bigNumber.charAt(counter));
            else
                numberArray[counter] = 0;
        }
    }

    public BigNum(BigNum bigNumber)
    {
        numberArray = bigNumber.numberArray;
    }

    public String bigNumberToString()
    {
        String output;

        output = "";

        for (int counter = 0; counter < SIZE ; counter++)
        {
            output += Integer.toString(numberArray[counter]);
        }
        return output;
    }

    public boolean bigNumberEquals(BigNum bigNumber)
    {
        return this.bigNumberToString().equals(bigNumber.bigNumberToString());
    }

    public boolean isZero()
    {
        return this.bigNumberToString().equals(new BigNum().bigNumberToString());
    }

    public void shift(boolean left)
    {
        int firstElement;
        int lastElement;

        if (left)
        {
            firstElement = this.numberArray[0];

            for (int counter = 0; counter < SIZE; counter++)
            {
                if (counter != SIZE - 1)
                    this.numberArray[counter] = this.numberArray[counter + 1];
                else
                    this.numberArray[counter] = firstElement;
            }

        } else
            {
                lastElement = this.numberArray[SIZE -1];

                for (int counter = SIZE - 1; 0 <= counter; counter--)
                {
                    if (counter != 0)
                        this.numberArray[counter] = this.numberArray[counter -1];
                    else
                        this.numberArray[counter] = lastElement;
                }
            }
    }

    public String reverseToString(BigNum bigNumber)
    {
        String output;
        int value;

        output = "";

        for (int counter = 0; counter < SIZE; counter++)
        {
            value = bigNumber.numberArray[counter];
                output += Integer.toString(value);
        }
        return Conversion.reverse(output);
    }

    public BigNum add(BigNum bigNumber)
    {
        BigNum output;

        int number1;
       
        int number2;

        number1 = Conversion.toDecimal(BASE, reverseToString(this));
        System.out.println( number1);
        number2 = Conversion.toDecimal(BASE, reverseToString(bigNumber));
        System.out.println(number2);
        if (Integer.toString(number1 + number2).length() <= SIZE)
            output = new BigNum(Conversion.toOtherBase(BASE, number1 + number2)); 
        else
            output = new BigNum();

        return output;
    }

    public static BigNum randomInstanceCreator()
    {
        BigNum output;

        String objectInput;
        objectInput = "";

        for (int counter = 0; counter < SIZE; counter++)
        {
            objectInput += Integer.toString((int) (Math.random() * (BASE)));
        }
        output = new BigNum(objectInput);

        return output;
    }

    public boolean isLessThan(BigNum bigNumber)
    {
        boolean lessThan;

        lessThan = false;

        for (int counter = SIZE - 1; 0 < counter; counter--)
        {
            if (lessThan = this.numberArray[counter] < bigNumber.numberArray[counter])
            {
                lessThan = true;
                counter = 0;
            }
        }
        return lessThan;
    }
}