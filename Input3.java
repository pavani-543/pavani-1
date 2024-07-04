import java.io.*;
class Input3
{
 public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enterInteger value:");
 int n=Integer.parseInt(br.readLine());
 System.out.println("entered integer:"+n);
 }
}