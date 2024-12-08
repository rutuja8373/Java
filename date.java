import java.util.*;
class InvalidDate extends Exception
{
	public String toString()
	{
		return "invalid date exception...";
	}
}
class MyDate
{
	int dd,mm,yy;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date in format of dd,mm,yy");
		dd=sc.nextInt();
		mm=sc.nextInt();
		yy=sc.nextInt();
		try{
			if(dd<1||dd>31)
					throw new InvalidDate();
			else if(mm<1||mm>12)
				throw new InvalidDate();
			else if(yy<1000||yy>10000)
				throw new InvalidDate();
			
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
	void disp()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	public static void main(String[] args)
	{
		MyDate ob=new MyDate();
		ob.accept();
		ob.disp();
	}
}
