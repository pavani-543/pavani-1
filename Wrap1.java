import java.lang.*;
class Wrap1
 {
  public static void main(String args[])
  {
   Int a=new Integer(67);//warpper class
   int i=a;int Value;//converting Integer to int
   int j=a;//unboxing
   System.out.print(a+""+i+""+j);
   }
  }