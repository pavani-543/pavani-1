import java.util.*;
import java.text.*;
class DateDemo
{
 public static void main(String args[])
 {
  Date d=new Date();
  DateFormat fmt=DateFormat.getDateInstance(DateFormat.LONG,Locale.UK);
  String s=fmt.format(d);
  System.out.println("current date:"+s);
   DateFormat time=DateFormat.getTimeInstance(DateFormat.LONG,Locale.UK);
   String t=time.format(d);
   System.out.println("current time:"+t);
   }
  }