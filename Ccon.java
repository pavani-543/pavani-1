class Rectangle
 {
  int length;//instance variables
  int breath;
  Rectangle(int l,int b)//parameterized constructor
  {
   length=1;
   breath=b;
   }
   Rectangle(Rectangle obj)
   {
    length=obj.length;
    breath=obj.breath;
    }
    int area()
    {
     return length*breath;
     }
     }
     class Ccon
     {
      public static void main(String args[])
     {
      Rectangle rect=new Rectangle(23,78);
      Rectangle rect1=new Rectangle(rect);//copy constructor
      System.out.println("area of rectangle:"+rect.area());
      System.out.println("area of rectangle:"+rect1.area());
     }
    }