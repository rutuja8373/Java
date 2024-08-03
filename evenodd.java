import java.util.*;
class EvenOdd
{
    void check(int n)
    {
         if(n%2==0)
		  System.out.println("no is even...");
         else
                System.out.println("no is odd...");
    }
    public static void main(String arg[])
    {
         int n;
         Scanner sc=new Scanner(System.in);
         EvenOdd ob=new EvenOdd();
         System.out.println("Enter no to check even or odd:");
         n=sc.nextInt();
         ob.check(n);
    }
}