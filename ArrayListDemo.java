import java.util.*;
class ArrayListDemo
{
 public static void main(String args[])
{
 ArrayList<String>arl=new ArrayList<String>();
 arl.add("apple");
 arl.add("mango");
 arl.add("guva");
 arl.add("grapes");
 arl.add("banana");
 System.out.println("ArrayList="+arl);
 arl.remove("guva");
 arl.remove(2);
 System.out.println("arrayList elements="+arl);
 System.out.println("size="+arl.size());
 Iterator it=arl.iterator();
 while(it.hasNext())
  System.out.println(it.next());
  }
 }

 