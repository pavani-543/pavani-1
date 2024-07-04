class person
{
 private String name;//instance variables
 private int age;
 person(String str, int a)//parameterized Constructor
 {
  name=str;
  age=a;
  }
  public void  show()//method
  {
   System.out.println("name is:"+name);
   System.out.println("age is:"+age);
   }
   }
  class Demo16
  {
   public static void main(String args[])
   {
    person p1=new person("john",27);
    p1.show();
    person p2=new person("mahendra",25);
    p2.show();
   }
   }
   