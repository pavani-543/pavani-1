class employee 
{
 int id;
  Sring name;
  int m;
  void set ID=(int id);
  {
   this.id=id;
   }
   void set Name(String name)
   {
    this.name=name;
    }
     void stem(int m)
    {
     this.m=m;
     }
     void display()
     {
      System.out.println("id:"+id+"\n Name:"+name+"\n salary:"+m);
      }
      }
      class department extends employee
      {
       int deptno;
       String deptName;
       depatment(int deptno,String deptname)
       {
        this.deptno=deptno;
        this.deptname=deptname;
        void show()
        {
         display();
         System.out.println("\ndeptno:"+deptno+"\n deptname:"+deptname);
         }
         }
         class single1
         {
          public static void main(String args[])
          {
           department d=new department(4567,"trainer");
           d.setID(123);
           d.setName("jhon");
           d.setm(78000);
           d.show();
          }
         }