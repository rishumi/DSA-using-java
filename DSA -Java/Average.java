
import java.util.*;
public class Average 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the frist number: ");
        double x = sc.nextDouble();
        System.out.println("input second number: ");
        double y = sc.nextDouble();
        System.out.println("Input the third number: ");
        double z = sc.nextDouble();
        System.out.println("The Averhae value is:" + average(x, y, z) + "\n");
    }

    public static  double average(double x, double y, double z)
    {
        return (x + y + z)/3;
    }


    
}
