import java.util.*;
public class Main
{
    void home()
    {
        System.out.println("Welcome to my paradise!");
    }
    
    void members(String name, int age)
    {
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
    
    int future(int age)
    {
        return age+5;
    }
    
    void check(String myname)
    {
        if(myname.equals("Gowri"))
        {
          System.out.println("Welcome "+myname+"!");
        }
        else
        {
          System.out.println("Access Denied!");
        }
    }
    
    public static void main(String[] args)
    {
        Main m = new Main();
        m.home();
        m.members("Gowri Mungath",19);
        int f;
        f = m.future(19);
        System.out.println("In 5 years, I'll be "+f+" years old.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        String me = sc.nextLine();
        m.check(me);
    }
}
