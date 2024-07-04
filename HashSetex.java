import java.io.*;
import java.util.*;
class HashSetex
{
 public static void main(String args [])throws IoException
 {
 HashSet<Integer>hs=new HashSet<Integer>();
 ArrayList<Integer arl= new ArrayList<Integer>();
 BufferedReader br=new BufferedReader(newInputStreamReader(System.in));
 for(int i=0;i<5;i++)
 {
 System.out.println("enter numbers:");
 int x=Integer.parseInt(br.readLine());
 hs.add(x);
 arl.add(x);
 }
 System.out.println("Hash Set class="+hs);
 System.out.println("ArrayList class="+arl);
 }
}