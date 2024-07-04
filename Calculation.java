class Calculation
{
 static int x=20;//static variable
 static int y=30;//static variable
 }
 class CalculationTest
 {
 void addition()
 {
  int a= Calculation.x;
  int b= Calculation.y;
  int c=a+b;
  System.out.println(c);
  }
  void substraction()
  {
   int p= Calculation.x;
   int q= Calculation.y;
   int r= p-q;
   System.out.println(r);
  }
  public static void main(String[]args)
{
 CalculationTest ct=new CalculationTest();
 ct.addition();
 ct.substraction();
 }
 }
 