import java.io.*;
import java.util.*;
class lldemo
{
 public static void main(String args[])throw IoException
{
 LinkedList<String>ll=new LinkedList<String>();
  ll.add("america");
  ll.add("japan");
  ll.add("china");
  ll.add("russia");	
  System.out.println("list="+ll);
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String element;
  int pos,choice=0;
  while(choice<4)
  {
   System.out.println("linked list operations");
   System.out.println("1.intrest element");
   System.out.println("2.remove  element");
   System.out.println("3.change element");
   System.out.println("4.exit");
   System.out.println("enter your choice:");
   Choice=Integer.parseInt(br.readLine());
   switch(choice)
   {
    case 1:
    System.out.println("enter element:");
    element=br.readLine();
    System.out.println("enter position:");
    pos=Integer.parseInt(br.readLine());
    ll.add(pos,element);
    break;
    case 2:
    System.out.println("enter position:");
    pos=Integer.parseInt(br.readLine());
    ll.remove(pos);
    break;
    case 3:
    System.out.println("enter element");
    element=br.readLine();
    System.out.println("enter position:");
    pos=Integer.parseInt(br.readLine());
    ll.set(pos,element);
    break;
    default;
    return;
    }
    System.out.println("list="+ll);
    }
   }
  }