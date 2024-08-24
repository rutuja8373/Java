import java.util.*;
class Emp1
{
  int eno;
  String name;
  float sal;
  void accept()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter emp no=");
      eno=sc.nextInt();
      System.out.println("Enter emp name=");
      name=sc.next();
      System.out.println("Enter emp salary=");
      sal=sc.nextFloat();
  }
void display()
{
    System.out.println("Emp no="+eno);
    System.out.println("Emp name="+name);
    System.out.println("Emp salary="+sal);
}
public static void main(String arg[])
{
     Emp1 ob[]=new Emp1[10];
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter limit=");
     n=sc.nextInt();
     for(i=0;i<n;i++)
     {
          ob[i]=new Emp1();
          ob[i].accept();
     }
    System.out.println("Emp info=");
    for(i=0;i<n;i++)
   {
        ob[i].display();
    }
}
}