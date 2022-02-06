// @Author Dilay Yiðit
// @Date 19/12/2019
public class Lab10
{
    public static void main(String[] args)
    {

        String divider = "------------------------------------------------------------------";

        System.out.println(divider);

        BigNums biggestsNumber = new BigNums();
        biggestsNumber.bigNumsToString();

        BigNum a = new BigNum();
        BigNum b = new BigNum("110");
        BigNum c = new BigNum("011");
        BigNum d = new BigNum(c);

        System.out.println(divider);

        System.out.println("a < b : " + a.isLessThan(b));
        System.out.println("a < c : " + a.isLessThan(c));
        System.out.println("c < b : " + c.isLessThan(b));

        System.out.println("d equals to c : " + d.bigNumberEquals(c));

        System.out.println(divider);

        System.out.println(a.isZero());
        System.out.println("sum: " + b.add(c).bigNumberToString());

        b.shift(true);
        System.out.println(b.bigNumberToString());

        System.out.println(divider);

        System.out.println("c is = " + c.bigNumberToString());
        System.out.println("b is = " + b.bigNumberToString());

        System.out.println(divider);

        biggestsNumber.biggestNumberFinder();
        
        System.out.println(Character.getNumericValue('A'));
    }
}