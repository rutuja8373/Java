import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
          int a[]=new int[10];
          Scanner sc=new Scanner(System.in);
          System.out.println("enter limit:");
          int n=sc.nextInt();
          System.out.println("enter array element:");
          for(int i=0;i<n;i++)
          {
                a[i]=sc.nextInt();
          }
         System.out.println("array element:");
         for(int i=0;i<n;i++)
         {
               System.out.println(" "+a[i]);
         }
    }
}