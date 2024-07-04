import java.io.*;
class Create1
{
 public static void main(String args[])throws Exception
 {
  DataInputStream dis=new DataInputStream(System.in);
  FileWriter fw=new FileWriter("myfile1.txt",true);
  char ch;
  System.out.println("enter data (@ at end):");
  while((ch=(char)dis.read())!='@')
  fw.write(ch);
  fw.close();
  dis.close();
  }
 } 