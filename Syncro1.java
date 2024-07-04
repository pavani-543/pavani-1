class Reserve extends Thread
{
 int available=1;
 int wanted;
 Reserve(int i)
 {
  wanted=i;
  }
  public void run()
  {
   synchronized(this)
   {
    System.out.println("available no of breaths="+available);
    if(available>=wanted)
    {
    String name=Thread.currentThread().getName();
   System.out.println(wanted+"breaths are alloted for"+name);
    try
   {
    Thread.sleep(2000);
    available=available-wanted;
    }
     catch(InterruptedException ie){}
     }
    else
    {
     System.out.println("sorry breaths are not available");
     }
    }
   }
  }
   class Syncro1
  {
   public static void main(String args[])
  {
   Reserve obj=new Reserve(1);
     t1.setName("first");
     t2.setName("second");
      t1.start();
      t2.start();
      }
     }