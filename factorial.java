import java.util.*;
public class Main
{
    static int factorial(int n)
    {
        int fact = 1;
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            fact = n*factorial(n-1);
        }
        return fact;
    }
    
    public static void main(String[] args)
    {
        System.out.println("FACTORIAL FINDER");
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is : "+factorial(n));
    }
}
