import java.util.Scanner;

// @Author Dilay Yiðit
// @Date 19/12/2019

public class BigNums
{

  private static final int SIZE = 8;

    private BigNum[] bigNumsArray;

    public BigNums()
    {
        bigNumsArray = new BigNum[10];

        for (int counter = 0; counter < 10; counter++)
        {
            bigNumsArray[counter] = BigNum.randomInstanceCreator();
        }
    }


    public void bigNumsToString()
    {
        for (int counter = 0; counter < (SIZE - 1); counter++)
        {
            System.out.println(bigNumsArray[counter].bigNumberToString() + " Index : " + (counter + 1));
        }
    }

    public void biggestNumberFinder()
    {
        Scanner scan;

        int n;
        int indexOfMax;

        scan = new Scanner(System.in);
        indexOfMax = 0;

        do {
            System.out.println("------------------------------------------------------------------");
            this.bigNumsToString();
            System.out.println("------------------------------------------------------------------");

            System.out.print("Enter the \"n\" for the interval [0, n) which you want to search for the biggest number where max n < 10 : ");
            n = scan.nextInt();

            if (n < 10)
            {
                for (int counter = 1; counter <= n; counter++)
                {
                    if(this.bigNumsArray[indexOfMax].isLessThan(this.bigNumsArray[counter]))
                    {
                        indexOfMax = counter;
                    }
                }

                if (indexOfMax != 0)
                {
                    BigNum changer;

                    changer = this.bigNumsArray[indexOfMax - 1];
                    this.bigNumsArray[indexOfMax - 1] = this.bigNumsArray[indexOfMax];
                    this.bigNumsArray[indexOfMax] = changer;
                }
            }
            else
                System.out.println("Please enter the n between [0, 10)");

            }while (n != 0);
    }
}