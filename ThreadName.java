// given you own priority or own thread name
 class ThreadName
 {
  public static void main(String args[])
  {
   Thread th=Thread.currentThread();
   System.out.println("hai"+th);
   System.out.println("default thread name is"+th.getName());
   th.setName("jhon");
   System.out.println("new thread name is"+th.getName());
   System.out.println("default priority is"+th.getPriority());
   th.setPriority(8);
   System.out.println("new priority is"+th.getPriority());
   System.out.println(th.currentThread());
   }
  }
 
 