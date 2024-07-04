//copying a data from one file to another file
 import java.io.*;
 public class Copyfile
 {
  public static void main(String args[])throws IOException
  {
   FileInputStream in=null;
   FileOutputStream out=null;
   try
   {
    in=new FileInputStream("Myfile1.txt");
    out=new FileOutputStream("output1.txt");
    int c;
    while((c=in.read())!=-1)
    {
     out.write(c);
     }
    }
    finally
    {
     if(in!=null)
      {
       in.close();
       }
       if(out!=null)
       {
        out.close();
        }
       }
      }
     }