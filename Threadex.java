class Threadex
{
 public static void main(String args[])
 {
  System.out.println("let us find currennt thread");
  Thread t=Thread.currentThread();
  System.out.println("threadName:"+t.getName());
  }
 }