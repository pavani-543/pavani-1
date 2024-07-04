class NarrA2
{
 public void message()
 {
  System.out.println("message from A");  
  }
 }
 class B1 extends A
 {
  public void message()
  {
   System.out.println("message from B");
   }
   public static void main (String args[])
   {
    A a=new B1();
    /* object of  sub class(B)is refereced by reference of super class(A)*/
    B1 b=(B1)a;
   /*reference of a superclass(B) type is downcasted/narrowed to the reference of sub class(A)*/
   b.message();
   /* message() of super class is overriden in sub class*/
   }
   }
    

