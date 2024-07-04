public class Counter
{
 //Create a static variable and intialize it 0
   Static int x=0;
  //Declare a Constructor
    Counter()
    {
     x++;
    }
   //Declare an instance method
     void display()
     {
      System.out.println(x);
     }
     public static void main(String[]args)
     {
      counter c1=new counter();
      c1.display();
      counter c2= new counter();
      c2.display();
     Counter c3=new counter();
     c3.display();
     }
     }