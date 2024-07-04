import java.io.*;
class Input2
{
 public static void main(String args[]) throw IoException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  char ch=(char) br.read();
  System.out.println("entered character:"+ch);
  }
}