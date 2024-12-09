class Demo
{
     void evenodd(int n)
      {
             if(n%2==0)
			System.out.println("even");
 		else
			System.out.println("odd");
      }
    void leapyear(int y)
    {
          if(y%4==0)
		System.out.println("leap year");
	  else
		System.out.println("not leap year");
    }
    void square(int n)
     {
           int c=n*n;
		System.out.println("square="+c);
     }
     public static void main(String arg[])
     {
            Demo ob;
	    ob=new Demo();
	    ob.evenodd(6);
	    ob.leapyear(2024);
	    ob.square(6); 
     }
}