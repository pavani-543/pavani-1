import java.io.*;
class Bufferedclsex
{
 public static void main(String args[]){
 try
 {
  //create a FileInputStream
  FileInputStream fis=new FileInputStream("create1.java");
  //create a BufferedInputStream
 BufferedInputStream bis=new BufferedInputStream(fis);
 //read and display data
  int i;
  while((i=bis.read())!=-1)
  {
   System.out.println((char)i);
   }
   //close FileInputStream
     fis.close();
     }
      catch(Exception e)
      {
       System.out.println(e);
      }
     }
    }