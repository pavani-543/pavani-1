import java.io.*;
class Input4
{
 public static void main(String args[])throws IOException
{
 BufferedReader br= new BufferedReader(new InputStreamingReader(System.in));
 System.out.println("enter id:");
 int id = Integer.ParseInt(br.readLine());
System.out.println("enter name");
 String name= br.readline();
 System.out.println("enter salary");
 float sal= Float.ParseFloat(br.readLine());
 System.out.println("enter gender:");
 char ch=(char)br.read();
 System.out.println("emp id:"+id);
 System.out.println("emp name:"+name);
 System.out.println("emp salary:"+sal);
 System.out.println("emp gender:"+gen);
 }
}