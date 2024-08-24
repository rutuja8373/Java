import java.util.*;
class stud
{
 int rno;
 String name;
 float per;
void accept()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter rno=");
   rno=sc.nextInt();
   System.out.println("enter name=");
   name=sc.next();
   System.out.println("enter percentage=");
   per=sc.nextFloat();
}
void display()
{
    System.out.println("student rno="+rno);
    System.out.println("student name="+name);
    System.out.println("student percentage="+per);
}
static void sort(stud ob[],int n)
{
    int pass,i;
    stud temp;
    for(pass=1;pass<n;pass++)
    {
        for(i=0;i<n-pass;i++)
        {
            if(ob[i].per<ob[i+1].per)
            {
                 temp=ob[i];
                 ob[i]=ob[i+1];
                 ob[i+1]=temp;
            }
        }
    }
}
public static void main(String arg[])
{
   Scanner sc=new Scanner(System.in);
   int i,n;
   stud ob[]=new stud[10];
   System.out.println("enter limit:");
   n=sc.nextInt();
   for(i=0;i<n;i++)
   {
       ob[i]=new stud();
       ob[i].accept();
   }
 sort(ob,n);
  for(i=0;i<n;i++)
  {
     ob[i].display();
  }
}
}