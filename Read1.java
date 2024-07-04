import java.io.*;
class Read1
{
 public static void main(String args[])throws Exception
 {
  FileReader fr=new FileReader("create1.java");
  int ch;
  while((ch=fr.read())!=-1)
  System.out.print((char)ch);
  fr.close();
  }
 }