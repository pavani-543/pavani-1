enum days
{
 sunday,monday,tuesday,wednesday,thursday,friday,saturday
 }
 class display
 {
  public static void main(String args[])
  {
   //retreive constants from enumaration
   days d[]=days.values();
   System.out.println("the constants are:");
   for (days i:d)
              System.out.println(i);
   }
  }