class Employee
{
 private int id;//instance variables
 private string name;
 private double sal;
 //mutator methods
 void setId(int id)
 {
  this.id=id;
  }
  void setName(String name)
  {
   this.name=name;
   }
   void set sal(double sal)
   {
    this.sal=sal;
    }
    //Accessor methods
      int getId()
      {
       return id;
      }
      String getName;
      {
       return name;
       }
       double getsal()
       {
        return sal;
        }
        }
        class Use
       {
        public static void main(String args[])
        {
         employee e=new employee();
         e.setId(234);
         e.setName("pavani");
          e.setsalary(6,70,000.123);
         System.out.println("emp id:"+e.getId());
         System.out.println("emp Name:"+e.getname());
         System.out.println("Sal=:"+e.getsal());
        }
        }