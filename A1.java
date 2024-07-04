class A1
{
 public void message()
 {
 System.out.println("message of A class);
 }
 }
 class B extends A
 {
  public void message()
  {
  System.out.println("message fromB");
  }
  public static vpid main(String args[])
  {
   B b=new B();
   A a=b;
   a.message();
   }
  }