import java.lang;
 class Employee implements clonable
 {
  this.id=id;
  this.name=name;
  }
  void display()//method
  {
   System.out.println("emp:+id+"\t emp name:"+name);
   }
   public object clone()throws clone not support Execption
   {
    return super.clone();
    }
   }
    class clonedemo
    {
     public ststic void main(String args[]throws clonesupported Execption
   {
    Employee e=new Employee(123,"jhon");
    e.display();
    Employee e1=(Employee)e.clone();
    e1.display();
    }
   }

 