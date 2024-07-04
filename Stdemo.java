import java.util.*;
import java.io.*;
class Stdemo
{
 public static void main(String args[])throws IOException
 {
  String s="hello its a,java program";
  StringTokenizer st=new StringTokenizer(s," ");
  while(st.hasmoreToken())
  {
   System.out.println(st.nextToken());
   }
  }
 }
  