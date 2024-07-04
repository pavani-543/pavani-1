class Demo
{
 static int a=20;
 static int b=50;
 static int c=100;
Demo()
{
 a=3;//changed value of variable
 }
 static
{ 
 a=10;
}
 void m1()
 {
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);//It will print100
  }
  static void m2()
  {
   c=200;
  }
   void m3()
   {
    c=200;
    }
    public static void main(String[]args)
    {
     Demo d=new Demo();
     d.m1();
   }
 }
  