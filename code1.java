//This is my first Java program
/*Helloooo*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    //Variable declaration and printing
	    int a=19;
	    String name = "Gowri ";
	    float w =38.5f;
	    char fl ='G';
	    boolean isit =true;
		System.out.println("Hello World");
		System.out.println("My name is "+name+" and I am "+a+" years old.");
		System.out.println("I weigh "+w);
 		System.out.println("My name begins with letter "+fl);
		System.out.println("Yes its "+isit);
		
	    //typecasting
        double p = a;
        System.out.println(p);
        int b = (int) p;
        System.out.println(b);
        
        //String 
        String lname = "Mungath";
       	System.out.println(name.length());
       	System.out.println(name.toUpperCase());
       	System.out.println(name.toLowerCase());
       	System.out.println(name.indexOf("wri"));
        System.out.println(name.length());
        System.out.println(name.concat(lname));
        System.out.println("Robot \"robosight\" is good");
        
        //Math
        System.out.println(Math.max(5,2));
        System.out.println(Math.min(5,2));
        System.out.println(Math.abs(-5.2));
        System.out.println(Math.sqrt(52));
        int ran = (int) (Math.random()*53);
        System.out.println(ran);
        
        //if-else
        int x=5;
        int y=10;
        if(x<y)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        //conditional operator 
        String output = (x<y)?"Yes":"No";
        System.out.println(output);

        
        //vowel checker - switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your alphabet : ");
        char alpha = sc.next().charAt(0);
        switch(alpha)
        {
            case 'a':
                System.out.println("It is a vowel");
                break;
            case 'e':
                System.out.println("It is a vowel");
                break;
            case 'i':
                System.out.println("It is a vowel");
                break;
            case 'o':
                System.out.println("It is a vowel");
                break;
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");
                break;
        }
        
        //while
        int i=1;
        while(i<=10)
        {
            System.out.print(i);
            i++;
        }
        System.out.println();
         
        int j=1;
        do
        {
            System.out.print(j);
            j++;
        }
        while(j<=10);
        System.out.println();
        
        //for
        for(i=1;i<=10;i=i+2)
        {
            System.out.println(i);
        }
        
        //for-each
        int[] arr = {17,2,15,8};
        for(int num : arr)
        {
          System.out.println(num);
        }
        
        //break, continue
        for(i=0;i<10;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.print(i);
        }
        System.out.println();
        for(i=0;i<10;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        
        //Arrays 
        String[] myfamily = {"amma","achan","gowri","kannan","jassim","ponnu","vappa","umma"};
        System.out.println(myfamily[4]);
        myfamily[2]="sreekutty";
        for(int g=0;g<myfamily.length;g++)
        {
          System.out.println(myfamily[g]);   
        }
        for(String m:myfamily)
        {
          System.out.println(m);   
        }
        
        //multidimensional-array
        String[][] friends = {{"sree","rona","gowri"},{"anu","sneha","faathu"},{"naveen","nathu","mamman","johney"}};
        System.out.println(friends[2][1]);   
        for(int g=0;g<friends.length;g++)
        {
            for(int h=0;h<friends[g].length;h++)
            {
                System.out.println(friends[g][h]);   
            }
        }
    }
}
