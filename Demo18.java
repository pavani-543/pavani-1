class person 
{
private String name;//instance variable
private int age;
person()//default construction
{
 name="sindhi";
 age=30;
 }
 person(String str,int a)//parameterized constructor
 {
  name=str;
  age=a;
 }
 public void show()//method
 {
  System.out.println("name is:"+name);
  System.out.println("age is:"+age);
  }
}
  class Demo18
  {
   public static void main(String args[])
  {
  person p=new person();
  p.show();
  person p1=new person("sai kiran",22);
  p1.show();
  }
  }
