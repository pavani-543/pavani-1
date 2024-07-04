import java.io.*;
class filedetails
{
 public void display()
 {
  File f= new File("D:/Java p/create1.java");
  System.out.println("it is file:"+f.isFile());
  System.out.println("file name:"+f.getName());
  System.out.println("filepath:"+f.getPath());
  System.out.println("size of the file:"+f.length());
  System.out.println("parent of the file:"+f.getParent());
  System.out.println("Modify time:"+f.lastModified());
  System.out.println("file is hidden:"+f.isHidden());
  System.out.println("can write:"+f.canWrite());
  }
 }
 class FileDemo
 {
  public static void main(String args[])
  {
   new filedetails().display();
   }
  }