import java.util.*;
class CalendarDemo
{
 public static void main(String args[])
 {
  Calendar c=Calendar.getInstance();
  int day=c.get(Calendar.DATE);
  int month=c.get(Calendar.MONTH);
  int year=c.get(Calendar.YEAR);
  System.out.println("current Date:"+day+"-"+month+"-"+year);
  int hour=c.get(Calendar.HOUR);
  int minute=c.get(Calendar.MINUTE);
  int seconds=c.get(Calendar.SECOND);
  System.out.println("current time:"+hour+":"+minute+":"+seconds);
  }
 }