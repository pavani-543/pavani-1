import java.io.*;
import java.util.*;
class Hashtabledemo
{
 public static void main(String args[])
{
 Hashtable<String,Integer>ht=new Hashtable<String,Integer>();
 ht.put("sachin",77);
 ht.put("dhoni",88);
 ht.put("kholi",99);
 ht.put("yuvaraj",90);
 ht.put("sehwag",150);
 System.out.println("the player names are:");
 Enumeration e=ht.keys();
 while(e.hasmoreElements())
 System.out.println(e.nextElement());
 BufferedRerader br=new BufferReader(new InputStreamReader(System.in));
System.out.println("enter player name:");
String name=br.readLine();
Integer score=ht.get(name);
if(score==null)
System.out.println("player not found");
else
{
 int sc=score.intValue();
 System.out.println(name+"has Scored run="+sc);
 }
 }
 }