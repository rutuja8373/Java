import java.util.*;
class CP1 
{
	int inn,not,total;
	String name;
	float bavg;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,innings,notout,totalruns");
		name=sc.next();
		inn=sc.nextInt();
		not=sc.nextInt();
		total=sc.nextInt();
		bavg=total/(inn-not);
	}
	static void sort(CP1 ob[],int n)
	{
		for(int pass=1;pass<n;pass++)
		{
			for(int i=0;i<n-pass;i++)
			{
				if(ob[i].bavg<ob[i+1].bavg)
				{
					CP1 t=ob[i];
					ob[i]=ob[i+1];
					ob[i+1]=t;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ob[i].name+"\t"+ob[i].inn+"\t"+ob[i].not+"\t"+ob[i].total+"\t"+ob[i].bavg);
		}
	}
	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter limit");
		n=sc.nextInt();
		CP1 ob[]=new CP1[n];
		for(i=0;i<n;i++)
		{
			ob[i]=new CP1();
			ob[i].accept();
		}
		sort(ob,n);
	}
}
