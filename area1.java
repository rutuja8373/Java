class Area
{
     void square(float s)
     {
         float a=s*s;
         System.out.println("Area of Square:"+a);
     }
      void rectangle(float l,float b)
     {
         float a=l*b;
         System.out.println("Area of Rectangle:"+a);
     }
      void triangle(float b,float h)
     {
         float a=0.5f*b*h;
         System.out.println("Area of Triangle:"+a);
     }
     public static void main(String arg[])
     {
          Area ob=new Area();
          ob.square(5.5f);
          ob.rectangle(3.2f,4.5f);
          ob.triangle(5.9f,7.8f);
     }
}