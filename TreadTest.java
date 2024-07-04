//By useing Thread class
class numbers extends Thread
 {
  public void run()
  {
   for(int bvar=-128;bvar<128;bvar++)
   {
    System.out.println(bvar);
    }
   }
  }
  class ThreadTest
    {
    public static void main(String args[])
    {
     numbers num=new number();
     num.start();
     }
    }