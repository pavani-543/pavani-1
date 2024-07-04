class A
{
 public void message()
  {
  System.out.println("message from A");
  }
 }
 class B2 extends A
 {
  public void message()
  {
   System.out.println("message from B");
  }
  public static void main(String args[])
  {
   A a=new B2();
  /* object of sub class(B2) is referenced by reference of super class(A)*/
  B2 b=(B2)a;
  /*reference of a superclass (B2) type is downcasted/narrowed to the reference of sub class(A)*/
  b.message();
  /* message()of super class is overriden in sub class*/
  }
  }

