import java.util.Scanner;
public class Twin_primes
{
    public static boolean isprime(int num)
    {

        if(num<=1)
        {
            return false;
        }

        for (int i =2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }

        return true;
    }
    public static void twin_primes(int range)
    {
    for(int i=2;i<=range-2;i++)
    {
        if(isprime(i)&&isprime(i+2)) {
            System.out.println("(" + i + "," + (i + 2) + ")");
        }
    }
    }
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = inp.nextInt();
        twin_primes(range);
    }
}
