class Circle
{
    void area(float r)
    {
          float a=3.14f*r*r;
          System.out.println("Area of circle="+a);
    }
    public static void main(String arg[])
    {
          Circle ob=new Circle();
           ob.area(4.5f);
    }
}