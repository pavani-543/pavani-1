import pack.Addition;
import pack.Subtraction;
class Use2
{
 public static void main(String args[])
 {
  Addition obj=new Addition(89.234,90.123);
 obj.sum();
 double res=Subtraction.sub(23.45678,90.12345);
 System.out.println("sub value is:"+res);
 }
 }