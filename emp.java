import java.util.*;
class EMP
{
   int eno;
   String name;
   float sal;
   void accept()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter emp no:");
        eno=sc.nextInt();
        System.out.println("enter emp name:");
        name=sc.next();
        System.out.println("enter emp salary:");
        sal=sc.nextFloat();
   }    
   void display()
   {
        System.out.println("emp no="+eno);
        System.out.println("emp name="+name);
	 System.out.println("emp salary="+sal);
   }
public static void main(String args[])
{
     EMP ob=new EMP();
     ob.accept();
     ob.display();
}
}