import java.util.*;
class cust
{
	int  cno;
	String name,addr,mno;
	static String pno;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer no,name,addr,phno");
		cno=sc.nextInt();
		name=sc.next();
		addr=sc.next();
		mno=sc.next();
	}
	static void search(cust ob[],int n)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ph no to search");
		pno=sc.next();
		for(i=0;i<n;i++)
		{
			if(pno.equals(ob[i].mno))
			{
				System.out.println("record is found..");
				System.out.println("cname="+ob[i].name);
			}
		}
		if(i==n)
			System.out.println("not found");
	}
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		n=sc.nextInt();
		cust ob[]=new cust[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new cust();
			ob[i].accept();
		}
		search(ob,n);
	}
}
