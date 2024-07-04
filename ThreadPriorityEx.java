class demo extends Thread
{
 public void run()
 {
  String name=Thread.currentThread().getName();
  for(int i=1;i<5;i++)
  {
   try
   {
    Thread.sleep(2000);
   }
   catch(InterruptedException ie){}
   System.out.println(name+":");
   }
  }
 }
 class ThreadPriorityEx
 {
  System.out.println("default thread priority\n....");
  System.out.println("mininum priority of a thread is"+Thread.MIN_PRIORITY);
  System.out.println("maximum priority of a thread is"+Thread.MAX_PRIORITY);
  System.out.println("normal priority of a thread is"+Thread.NORM_PRIORITY);
  demo obj=new demo(); 
  Thread t1=new Thread(obj,"First Thread");
  Thread t2=new Thread(obj,"second thread");
  t1.setPriority(1);
  t2.setPriority(2);
  t1.start();
  t2.start();
   }
  }            