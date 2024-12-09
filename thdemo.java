class Emp
{
     int eno;
     String name;
     float sal;
     void accept(int eno,String name,float sal)
     {
           this.eno=eno;
           this.name=name;
	    this.sal=sal;
     }
     void display()
      {
            System.out.println("Emp no="+eno);
	     System.out.println("Emp name="+name);
            System.out.println("Emp salary="+sal);
      }
     public static void main(String arg[])
     {
            Emp ob;
            ob=new Emp();
             ob.accept(101,"radha",70500);
             ob.display();
     }
}