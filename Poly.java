class sample
{
 void add(int a, int b)
 {
  System.out.println("sum of two numbers:"+(a+b));
  }
   void  add(int a, int b,int c)
   {
  System.out.println("sum of 3 members:"+(a+b+c));
  }
}
 class Poly
 {
  public static void  main(String args[])
  {
   sample  s=new sample();
   s.add(56,67,89);
   s.add(345,890);
   }
   }