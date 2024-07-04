import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task implements Runnable
{
 private String name;
 public Task(String s)
 {
  name=s;
  }
  public void run()
  {
   try
   {
    for(int i=0;i<5;i++)
   {
    if(i==0)
    {
  Date d=new Date();
  SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
  System.out.println("initalization time for"+
     "task name:"+name+"="+ft.format(d));
  }
   else 
   {
    Date d=new Date();
    SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
    System.out.println("excuting time for task name"+name+"="+ft.format(d));
    }
   Thread.sleep(1000);
   }
   System.out.println(name+"complete");
   }
    catch(InterruptedException e)
    {
     e.printStackTrace();
     }
    }
   }
   public class Threadex5
   {
    static final int MAX_T=3;
    public static void main(String args[])
   {
    Runnable r1=new Task("task1");
    Runnable r2=new Task("task2");
    Runnable r3=new Task("task3");
    Runnable r4=new Task("task4");
    Runnable r5=new Task("task5");
    ExecutorService p=Executors.newFixedThreadPool(MAX_T);
    p.execute(r1);
    p.execute(r2);
    p.execute(r3);
    p.execute(r4);
    p.execute(r5);
    p.shutdown();
    }
   }