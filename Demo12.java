class Person
{
 String name;//variables
 int age;
 void talk()//method
{
System.out.println("hello iam:"+name);
System.out.println("my age is:"+age);
}
}
class Demo12
{
public static void main(String args[])
{
 Person p=new Person();//'p' is object to the person class
 p.name="jhon";//object_name.variable_name
 p.age=32;
 p.talk();//object_name.method_name
 }
 }