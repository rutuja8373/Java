import java.util.*;
 class Cricket 
{
	String name;
	int innings,totalruns,notout;
	float batavg;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name,innings,totalruns,notout:");
		name=sc.next();
		innings=sc.nextInt();
		totalruns=sc.nextInt();
		notout=sc.nextInt();
		batavg=average(innings,totalruns,notout);
	}
	int average(int innings,int totalruns,int notout)
	{
		return totalruns/(innings-notout);
	}
	static void sort(Cricket ob[],int n)
	{
		int pass,i;
		for(pass=1;pass<n;pass++)
		{
			for(i=0;i<n;i++)
			{
				if(ob[i].batavg<ob[i+1].batavg)
				{
					Cricket t=ob[i];
					ob[i]=ob[i+1];
					ob[i+1]=t;
				}
			}
		}
		System.out.println("sorted cricket player");
		for(i=0;i<n;i++)
		{
			System.out.println(ob[i].name+"\t"+ob[i].innings+"\t"+ob[i].notout+"\t"+ob[i].totalruns+"\t"+ob[i].batavg);
		}
	}
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		n=sc.nextInt();
		Cricket ob[]=new Cricket[10];
		for(i=0;i<n;i++)
		{
			ob[i]=new Cricket();
			ob[i].accept();
		}
		sort(ob,n);
	}

}
