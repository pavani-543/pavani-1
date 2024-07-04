class ThreadDemo implements Runnable
{
 public static void main(String args[])
 {
  ThreadDemo obj=new  ThreadDemo();
  for(int i=1;i<10;i++)
  {
   System.out.println("This is main thread");
   }
   obj.create();
   }
   public void create()
   {
    Thread objth=new Thread(this);
    objth.start();
    }
    public void run()
    {
     for(int i=0;i<5;i++)
     {
      try
      {
       Thread.sleep(2000);
       System.out.println("this is child thread");
       }
        catch(InterruptedException e){}
        }
       }
      }