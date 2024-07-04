class Person
{
 private String name;//instance variable
 private int age;
 Person(String str,int a)//parameterized constructor
 {
  name=str;
  age=a;
  }
  public  void show()//method
  {
   System.out.println("name is:"+name);
   System.out.println("age is:"+age);
   }
   }
 class Demo17
{
 public static void main(String args[])
 {
 Person p=new Person("john",33);
 p.show();
 Person p2=new Person("mahendra",26);
 p2.show();
 }
 }