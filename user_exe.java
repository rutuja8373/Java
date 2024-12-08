import java.util.*;
class InvalidUser extends Exception
{
   public String toString()
   {
	   return "Invalid user and pass...";
   }
}
class s11_2 
{
	public static void main(String[] args)
	{
		String user,pass;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name and password=");
		user=sc.next();
		pass=sc.next();
		try{
		if(user.equals(pass))
			System.out.println("login succ....");
		else
			throw new InvalidUser();
		}
		catch(Exception e)
		{
			System.out.println(""+e);
		}
	}
}
