public class test2 
{
 public static void main(String args[])
 {
  test2 t=new test2();
  t=null;
  System.gc();
  }
  public void Finalize() throws Throwable
  {
   System.out.println("object destroyed by the garbage collector");
   }
}