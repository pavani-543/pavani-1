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
    SomeThread ft=new someThread("FristThread");
    SomeThread st=new someThread("secondThread");
    System.out.println("First thread is alive..."+ft.is Alive());//false
    System.out.println("second thread is alive..."+st.is Alive());//false
    System.out.println("main thread is alive...."+Thread.currentThread().is Alive());//true
   }
  }
