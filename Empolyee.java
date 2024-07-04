public class Employee
{
 String name;//instance variables
 int id;
 ststic String companyname="MICROSOFT";
 Employee(String n, int i)
 {
  name =n;
  id=i;
 }
 void display()
 {
  System.out.println("Name:"+name+""+"Id="+id+""+"company Name:"+""+companyName);
  }
  public static void main(String args[])
  {
   Employee e=new Employee("shubh",123);
   e.display();
   employee e1= new Employee("Deep",321);
   e1.display();
   }
   }