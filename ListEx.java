import java.util.*;
public class arrayListEx
{
public static void main(String args[])
{
 ArratList list=new ArrayList();
 list.add("20");
 list.add("30");
 list.add("40");
 System.out.println(list.size());
 System.out.println("while loop:");
 Iterator itr=list.Iterator();
 while(itr.hasNext())
 {
  System.out.println(itr.next());
 }
 System.out.println("Advanced for loop:");
 for(object obj:List)
 }
 System.out.println("for loop");
 for(int i=0;i<list.size();i++)
 {
  System.out.println(list.get(i));
  }
 }
}

