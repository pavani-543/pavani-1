import java.util.Iterator;
import java.util.*;
class Array6
{
 public static void main(String args[])
 {
  Double[] array={11.5,54.23,89.34,90.12};
  Iterator<Double> i= Arrays.asList(array).iterator();
  while(i.hasNext())
  {
   System.out.println(i.next());
   }
  }
 }