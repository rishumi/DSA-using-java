public class Factorial 
{
    public static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }
        return f; //factorial of n

    }

    public static int binCoeff(int n , int r)
    {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / ( fact_r * fact_nmr);
        return binCoeff;
    }
    
    //function to calculate 2 nos

    public static int sum(int a, int b)
    {
        return a+b;
    }
    // function to calcualte 3 nos
    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String args[])
    {
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 1, 2));
       
    }
    
}
