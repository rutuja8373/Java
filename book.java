import java.util.*;
class book
{
  int bno,qty;
  String name;
  void accept()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no=");
      bno=sc.nextInt();
      System.out.println("enter name=");
      name=sc.next();
      System.out.println("enter quantity=");
      qty=sc.nextInt();
  }
void display()
{
     System.out.println("book no="+bno);
     System.out.println("book name="+name);
     System.out.println("book quantity="+qty);
}
public static void main(String arg[])
{
    int i,n,f=0;
    String bname;
    book ob[]=new book[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter limit=");
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
          ob[i]=new book();
          ob[i].accept();
    }
     System.out.println("enter book name to search=");
      bname=sc.next();
      for(i=0;i<n;i++)
      {
           if(ob[i].name.equals(bname))
           {
                System.out.println("book quantity="+ob[i].qty);
                f=1;
                break;
           }
      }
      if(f==0)
      {
          System.out.println("book not found...");
      }
}
}