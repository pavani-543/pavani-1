class sample
{
 private double x,y;//instance variables
 Sample(double a, double b)//parameterized constructor
 {
  x=a;
  y=b;
  }
 void sum()//method
 {
  double z=x+y;
  System.out.println("sum is:"+z);
  }
  }
 class Method
 {
  public static void main(String args[])
  {
   Sample S=new sample(45.6789,78.12345);
   s.sum();
} 
}
   