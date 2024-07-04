import java.io.*;
class Student
{
 int m;
 Student(int id,string name,int m)
 {
  this.id=id;
  this.name=name;
  this.m=m;
  }
  void dislay()
  {
   System.out.println("id:"+"\name:"+name+"\nmarks:"+m);
   }
   }
   class section extends student
   {
    int rno;
    String sname;
    section(int id,string name,int m,int rno,string sname)
    {
     super(id,name,m);
     this.rno=rno;
     this.sname=sname;
     }
     void show()
     {
      display();
      System.out.println("\n roomno:"+rno+"section name:"+sname);
      }
     }
 class Single
 {
   public static void main(String args[])
   {
    section S=new section(23,"john",100,340,"CSE");
    S.show();
    }
    }
     
