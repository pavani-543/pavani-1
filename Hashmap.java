import java.io.*;
import java.util.*;
class Hashmapdemo
{
 public static void main(String args[])throws IoException
 {
 BufferesReader br=new BufferedReader(new InputStreamReader(System.in));
Hashmap<String,long>hm=new Hashmap<String,Long>();
String name,str;
Long phno;
while(true)
{
 System.out.println("1.store the telephone entries");
 System.out.println("2.Lookup for a Phone number");
 System.out.println("3.Exit");
 int n=Integer.perseInt(br.readLine());
 switch(n)
 {
  case 1:
  System.out.println("enter person name:");
  name=br.readLine();
  System.out.print("enter phno:");
  str=br.readLine();
  phno=new Long(str);
  hm.put(name,phno);
  break;
  case 2:
  System.out.println("enter name:");
  name=br.readLine();
  phno=hm.get(name);
  System.out.println("phone no:+phno);
  break;
  default:
  System.exit(0);
   }
  }
 }
}