class X
{
 public void methodA()//base class method`1`
 {
  System.out.println("hello,im method a of class x");
   }
   }
  class Y extends X
  {
   public  void methodA()
   {
   System.out.println("hello,im method A of class Y");
   }
}
class Z 
{
 public static void main(String args[])
 {
  X obj1=new X();
  X obj2=new Y();
  obj1.methodA();
  obj2.methodA();
  }
}
 

 
