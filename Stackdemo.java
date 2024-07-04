import java.io.*;
import java.util.*;
class Stackdemo
{
 public static void main(String args[])throws Exception
{
 styack<Integer>st=new stack<Integer>();
 int element,pos,choice=0;
 BufferedReader br=new BufferReder(new InputStreamReader(System.in));
 //menu
 while(choice<4)
 {
  System.out.println("stack operations");
  System.out.println("....................");
  System.out.println("1.push element");
  System.out.println("2.pop element");
  System.out.println("3.search for element");
  System.out.println("4.exit");
  System.out.println("enter your choice:");
  choice=Integer.parseInt(br.readLine());
  switch (choice)
  {
  case 1:
  System.out.println("enter element:");
  element=Integer.parseInt(br.readLine());
  st.push(element);
  break;
  case 2:
  Integer i=st.pop();
  System.out.println("popped="+i);
  break;
  case 3:
  System.out.println("enter element:");
  element=Integer.parseInt(br.readLine());
  pos=st.search(element);
  if(pos==-1)
  System.out.println("element not found");
  else
  System.out.println("element found at position:"+pos);
  break;
  default;
  return;
  }
  System.out.println("stack="+st);
  }
 }
}
  