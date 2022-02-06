// @Author Dilay Yiğit
// @Date 19/12/2019

public class Conversion
{

    public static int toDecimal(int base, String str)
    {
        int power;
        int number;

        power = 1;
        number = 0;

        for (int counter = str.length() - 1; counter >= 0; counter--)
        {
            if (value(str.charAt(counter)) >= base)
            {
                System.out.println("Invalid Number");
                return -1;
            }
            number += (str.charAt(counter) - 48) * power;
            power = power * base;
        }
        System.out.println("string " + str);
        return number;
    }

    public static String toOtherBase(int base, int number)
    {
        String string = "";
        String output = "";

        while (number > 0)
        {
            string += reValue(number % base);
            number /= base;
        }
        output += string;

        return reverse(output);
    }
    
    public static String reverse(String string)
    {
        String reversedString;

        reversedString = "";

        for (int counter = string.length() - 1; 0 <= counter; counter--)
        {
            reversedString += (string.charAt(counter));
        }

        return reversedString;
    }
    public static int value(char character)
    {
        if (character >= '0' && character <= '9')
            return (int)character - '0';

        else
            return (int)character - 'A' + 10;
    }

    private static char reValue(int number)
    {
        if (number >= 0 && number <= 9)
            return (char)(number + 48);

        else
            return (char)(number - 10 + 65);
    }
}