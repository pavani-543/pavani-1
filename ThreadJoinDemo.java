class SomeThread extends Thread
{
 String ThreadName;
 SomeThread(String ThreadName)
 {
  this.ThreadName=ThreadName;
  System.out.println("create thread...."+ThreadName);
  }
   public void run()
  {
   try
   {
    for(int ctr=1;ctr<=10;ctr++)
     {
      System.out.println("from"+ThreadName+"...."+ctr);
      sleep(1000);
      }
     }
     catch(Exception e)
     {
      System.out.println("Error in thread:"+ThreadName);
      }
     }
    }
    class ThreadJoinDemo
    {
     public static void main(String args[])throws Exception
   {
    SomeThread ft=new SomeThread("FristThread");
    SomeThread st=new SomeThread("secondThread");
    System.out.println("First thread is alive..."+ft.isAlive());//false
    System.out.println("second thread is live..."+st.isAlive());//false
    System.out.println("main thread is alive...."+Thread.currentThread().isAlive());//true
   }
  }
