public class FunctionOverloading 
{
    //function to call int sum

    public static int sum(int a, int b)
    {
        return a + b;
    }

    // function to call float sum
    public static float sum(float a, float b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2f, 4.8f));

    }
    
}
