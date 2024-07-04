import java.io.*;
import java.util.*;
class Hashtable demo
{
 public static void main(String args[])throw IoException
{
 Hashtabe<String,Integer>ht=new Hashtable<String,Intger>();
ht.put("sachin",77);
ht.put("dhoni",66);
ht.put("kholi",99);
ht.put("yuvaraj",90);
ht.put("sehwag",150);
System.out.println("the player name are:");
Enumaration e=ht.keys();
while(e.hasmoreElement())
System.out.println(e.nextElement());
BufferedReader br=new BufferReader(newInputStreamReader(System.in));
System.out.println("enter player name:");
String name=br.readLine();
Integer Score=ht.get(name);
if(score==null)
System.out.println("player not found");
else
{
 int sc=score.int Value();
 System.out.println(name+"has scored run="+sc);
  }
  }
 }