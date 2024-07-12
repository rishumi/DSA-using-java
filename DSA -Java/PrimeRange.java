import java.util.*;
public class primeRange 
{
    public static void primeInRange(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i)) //true
            {
                System.out.print(i + " ");

            }
        }
        System.out.println();

    }

    public static void main(String args[])
    {
        primeInRange(16);
    }
    
}
