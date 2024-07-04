class Student
{
 int id;
 String name;
 int m;
 Student(int id,string name,int m)
 {
  this.id=id;
  this.name=name;
  this.m=m;
  }
  void display()
  {
   System.out.println("id:"+id+"\n name:"+"\nmarak:"+m);
   }
   }
class Sports extends student
{
 int spm,tot;
 String sname;
 Sports(int id,string name,int m,int spm,string sname)
 {
  Super(id,name,m);
  this.tot=m;
  this.spm=spm;
  this.sname=sname;
  }
  void show()
  {
  display();
  System.out.println("\n sports name:"+sname+"\nsports marks:"+spm);
  }
  int result()
  {
   return tot+spm;
  }
  }
  class result extends sports
  { 
   int p;
   result()
   {
    super(4567,"charles",100,89,"shuttrle");
    p=super.result();
    super.show();
    System.out.println("total marks:"+p);
    }
   }
   class Multilevel
   {
    public static void main(String args[])
   {
    result r=new result();
    }
    }