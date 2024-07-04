class Sample
{
 static int i=100;//static variable
 static double sum(double x, double y)//static method
 {
 System.out.println(i);
 double z=x+y;
 return z;
 }  
class Static
{
 public static void main(String args[])
 {
  double res=Sample.sum(23.456,90.1234);
  System.out.println("sum is:"+res);
  }
  }
 