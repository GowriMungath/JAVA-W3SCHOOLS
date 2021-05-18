import java.util.*;
public class Main
{
    int area(int a)
    {
        return a*a;
    }
    
    double area(double r)
    {
        return 3.14*r*r;
    }
    
    double area(double b,double h)
    {
        return 0.5*b*h;
    }
    
    public static void main(String[] args)
    {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to find area of Square");
        System.out.println("Press 2 to find area of Triangle");
        System.out.println("Press 3 to find area of Circle");
        System.out.println("press 0 to exit");
        System.out.println("Enter your Choice : ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the side of Square : ");
                int a = sc.nextInt();
                System.out.println("Area of Square = "+m.area(a));
                break;
            case 2:
                System.out.println("Enter the base and height of Triangle : ");
                double b = sc.nextFloat();
                double h = sc.nextFloat();
                System.out.println("Area of Triangle = "+m.area(b,h));
                break;
            case 3:
                System.out.println("Enter the raidus of the Circle : ");
                double r = sc.nextFloat();
                System.out.println("Area of Circle = "+m.area(r));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Entry!");
                System.exit(0);
        }
    }
}                                                              
