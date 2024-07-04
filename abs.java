//abstract with both complte and incomplete/abstract method abstract class x//super class
{
 abstract void callme();
 public void normal()
 {
 System.out.println("this is complete method");
 }
 }
 class Y extends X
{
 void call me()
 {
  System.out.println("this is abstract method");
  }
  }
  class abs
  {
   public static void main(String args[])
   {
    Y obj=new Y();
    obj.callme();
    obj.normal();
    }
    }